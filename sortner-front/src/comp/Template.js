import {Form} from "./Form";
import {Nav} from "./Nav";
export function Template(){
	return(
		<div className="container-flex">
			<Nav />
			<div className="container my-container">
				<Form />
			</div>
		</div>
	);
}