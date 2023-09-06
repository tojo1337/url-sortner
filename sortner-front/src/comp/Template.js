import {Form} from "./Form";
import {Nav} from "./Nav";
export function Template(){
	return(
		<div className="container-fluid">
			<div className="col">
				<div className="row">
					<Nav />
				</div>
				<div className="row">
					<div className="container">
						<Form className="p-2" />
					</div>
				</div>
			</div>
		</div>
	);
}