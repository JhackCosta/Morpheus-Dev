import React from "react";
import Style from "./Input.module.css"




export default function Input({label,type,name, handleChange, value}){

    return(
        <>
            <input className={Style.inputs} type={type} name={name} placeholder={label} onChange ={handleChange} value={value} />
        </>
    );

};