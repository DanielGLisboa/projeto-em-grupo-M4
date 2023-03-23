import React from "react";
import styles from "./Home.module.css"
import { Button } from 'reactstrap';




export default class Home extends React.Component {

    render() {
        return (

            <>
                <div className={styles.background} >

                    <div className={styles.divp}>
                        <p className={styles.p}> TUDO O QUE VOCÊ GOSTA</p>
                        <p className={styles.p}>EM UM SÓ LUGAR</p>
                    </div>

                    <div className={styles.divbutton} >
                        <Button href="#" className={styles.button}>ASSINE JÁ!</Button>
                    </div>
                </div>

                <div className={styles.banner}>
                </div>
                

            </>



        );
    }
}