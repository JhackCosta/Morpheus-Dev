import { useState } from 'react'
import Cadastrar from './pages/Cadastrar/Cadastrar'

import { BrowserRouter, Routes, Route } from 'react-router-dom'

import './App.css'
import Listagem from './pages/Listagem/Listagem'

function App() {
  //const [count, setCount] = useState(0)

  return (
    
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Cadastrar/>}/>
            
          <Route path='/listar' element={<Listagem/>}/>
          
        </Routes>
      </BrowserRouter>
    
    </div>
    
  )
}

export default App
