import {LuMenu} from "react-icons/lu";
import "../style/Nav.css";
export function Nav(){
	return(
		<nav className="navbar navbar-light">
			<button className="btn btn-outline-dark"> 
				<LuMenu />
			</button>
		</nav>
	)
}