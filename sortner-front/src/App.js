import {BrowserRouter,Routes,Route} from "react-router-dom";
import {Template} from "./comp/Template";
import {RedirectView} from "./comp/RedirectView";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route index element={<Template />} />
        <Route path="/:surl" element={<RedirectView />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
