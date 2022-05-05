import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import React from 'react'
import FormService from '../Form/FormService'
import Home from '../Form/Home'

const AppRouter = () => {
    return (
        <div>
            <Router>
                <div className="col-md-6">
                    <Routes>
                        <Route path='/home' element={<Home />}></Route>
                        <Route path="/form-pedido" element={<FormService />}></Route>
                    </Routes>
                </div>
            </Router>
        </div>
    )
}

export default AppRouter;