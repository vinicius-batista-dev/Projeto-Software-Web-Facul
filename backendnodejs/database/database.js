
const Sequelize = require('sequelize');
const conn = new Sequelize(process.env.DB_SCHEMA || 'Pedidos',
                                process.env.DB_USER || 'root',
                                process.env.DB_PASSWORD || 'root',
                                {
                                    host: process.env.DB_HOST || 'localhost',
                                    port: process.env.DB_PORT || 3307,
                                    dialect: 'mysql',
                                    dialectOptions: {
                                        ssl: process.env.DB_SSL == "true"
                                    }
                                });
const Pedido = conn.define('Pedido', {
    nome: {
        type: Sequelize.STRING,
        allowNull: false
    },
    endereco: {
        type: Sequelize.STRING,
        allowNull: true
    },
    cidade: {
        type: Sequelize.STRING,
        allowNull: true
    },
    cpf: {
        type: Sequelize.STRING,
        allowNull: true
    },
    email: {
        type: Sequelize.STRING,
        allowNull: true
    },
    estado: {
        type: Sequelize.STRING,
        allowNull: true
    },
    mobile: {
        type: Sequelize.BIGINT,
        allowNull: true
    }
});
module.exports = {
    sequelize: conn,
    Pedido: Pedido
};