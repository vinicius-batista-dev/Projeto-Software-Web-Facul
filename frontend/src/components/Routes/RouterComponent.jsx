import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import React from 'react'
import FormService from '../Form/FormService'

const AppRouter = () => {
    return (
        <div>
            <Router>
                <div className="col-md-6">
                    <Routes>
                        <Route path="/formulario-de-pedido" element={<FormService />}></Route>
                    </Routes>
                </div>
            </Router>
        </div>
    )
}

export default AppRouter;