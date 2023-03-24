import styles from "./Card.module.css"
import ModalInformation from "../ModalMidiaInformation/ModalInformation"
export default function Card({url}){
    return (
        <div  style={{ backgroundImage: url }} className={styles.Card}>
                <ModalInformation className={styles.Information} />
            <span className={styles.Player}></span>
        </div>
    )
}