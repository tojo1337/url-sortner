export function SortUrl(props){
	return(
		<div class="form-group">
			<input class="form-control" type="text" placeholder={props.url} readonly />
		</div>
	);
}