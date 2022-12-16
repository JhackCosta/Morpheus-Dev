import React from "react";
import { useState } from "react";
import Input from "../../components/Input/Input";
import Button from "../../components/Button/Button";
import Style from "./Cadastrar.module.css";
import { url } from "../../services/Api";
import { Link } from "react-router-dom";

export default function Cadastrar() {

    const [data, setData] = useState();
    const [value, setValue] = useState({});

    function handleChange(e) {
        setValue({ ...value, [e.target.name]: e.target.value });
    }

    function cadastrarApi(url, data) {

        fetch(url + "/save", {
            method: "POST",
            body: JSON.stringify(data),
            headers: { "Content-type": "application/json; charset=UTF-8" }
        }).then(response => response.json())
            .then(json => { console.log(json) })
            .catch(err => alert("Formato da Data está inválido! formato: DIA/MÊS/ANO"));

    };
    return (
        <>
            <Link className={Style.filtrar} to="/listar">Pesquisar</Link>
            <form className={Style.containerForm} >
                <h2>Cadastrar usuário:</h2>
                <Input label="Nome" type="text" name="nome" value={value.nome} handleChange={handleChange} />
                <Input label="Idade" type="number" name="idade" value={value.idade} handleChange={handleChange} />
                <Input label="Data de Nascimento dia/mês/ano" type="text" name="dataNascimento" value={value.dataNascimento} handleChange={handleChange} />
                <Input label="CPF" type="text" name="cpf" value={value.cpf} handleChange={handleChange} />
                <Input label="E-mail" type="email" value={value.email} name="email" handleChange={handleChange} />
                <Button action={() => { cadastrarApi(url, value) }} label="Cadastrar" handleChange={handleChange} />
            </form>
        </>
    );
}


