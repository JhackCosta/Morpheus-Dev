import React from "react";
import Style from "./Card.module.css";

export default function Card({nome,email,idade,dataNascimento}){

    return(
        <div className={Style.card}>

            <p>Nome: {nome}</p>
            <p>Email: {email}</p>
            <p>Idade: {idade}</p>
            <p>Data de Nascimento: {dataNascimento}</p>
        
        </div>
    )


}