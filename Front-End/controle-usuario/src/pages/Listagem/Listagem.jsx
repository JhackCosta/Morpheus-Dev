import React from "react";
import { useState } from "react";
import Input from "../../components/Input/Input";
import Button from "../../components/Button/Button";
import Style from "./Listagem.module.css"
import { url } from "../../services/Api";
import Card from "../../components/Card/Card";

export default function Listagem() {

    const [data, setData] = useState([]);
    const [value, setValue] = useState("");

    function handleChange(e) {
        setValue({ ...value, [e.target.name]: e.target.value });
    }

    function buscarApi(url, nome) {
        fetch(url + `/selectlike/${nome}`, {
            method: "GET",
            headers: { "Content-type": "application/json; charset=UTF-8", 
            "Access-Controll-Allow-Origin": "*" }
        }).then(response => response.json())
            .then((json) => {
                console.log(json);
                setData(...data, json);
            })
            .catch(err => console.log(err));
    };
    return (
        <>
            <div className={Style.pesquisa}>
                <Input label="Nome do Usúario" type="text" name="nome" handleChange={handleChange} />
                <Button action={() => { buscarApi(url, value.nome) }} label="Buscar" />
            </div>

            <div className={Style.pai}>
                {
                    data.map((usuario, index)=> {
                        
                        return(
                            <Card key={index} nome={usuario.nome} email={usuario.email} idade={usuario.idade} dataNascimento={usuario.dataNascimento}/>
                        )

                    })
                }
            </div>
        </>
    );
}