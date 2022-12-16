import React from "react";
import Style from "./Button.module.css"

export default function Button({action, label}){

    return(
        <>
            <button type="submit" onClick={action}> {label} </button>
        </>
    );

};