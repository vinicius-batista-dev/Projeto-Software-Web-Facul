import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import React from 'react'
import FormService from '../Form/FormService'
import ListarPedidosComponent from '../Form/ListarPedido'

const AppRouter = () => {
    return (
        <div>
            <Router>
                <div className="col-md-6">
                    <Routes>
                        <Route path="/listar" element={<ListarPedidosComponent />}></Route>
                        <Route path="/adicionar" element={<FormService />}></Route>
                    </Routes>
                </div>
            </Router>
        </div>
    )
}

export default AppRouter;