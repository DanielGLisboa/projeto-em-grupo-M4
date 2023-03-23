import styles from "./BannerHome.module.css"
import { useState } from "react"
import Card from "../Cards/Card"

export default function BannerHome({url, urlCard1, urlCard2, urlCard3, urlCard4}){

    return (
        <div style={{ backgroundImage: url }} className={styles.Banner}>
            <div className={styles.player}>
                
            </div>
            <div className={styles.divCards}>
                <Card url={urlCard1}/>
                <Card url={urlCard2}/>
                <Card url={urlCard3}/>
                <Card url={urlCard4}/>
            </div>
        </div>
    )
}