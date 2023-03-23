import React from 'react';
import logo from "../../img/logo.png"
import styles from "../../headers.module.css"
import { Navbar, NavbarBrand, Button } from 'reactstrap';

  export default class HeadersHome extends React.Component {
	render() {
	  return (
		<div>
		  <Navbar color="black" dark expand="md">
			<NavbarBrand href="/">
			<img src={logo} alt="logo" height="30" />
			</NavbarBrand>
<<<<<<< HEAD
				<Button href="/login"className={styles.buttonEntrar}>Entrar</Button>
=======
				<Button className={styles.buttonEntrar}>Entrar</Button>
>>>>>>> 80ad8f53ee0f55e7837964dbc70d8e7d552e990b
		  </Navbar>
		</div>
	  );
	}
  }