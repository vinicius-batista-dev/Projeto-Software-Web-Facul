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
                        <Route path='/' element={<Home />}></Route>
                        <Route path="/formpedido" element={<FormService />}></Route>
                    </Routes>
                </div>
            </Router>
        </div>
    )
}

export default AppRouter;