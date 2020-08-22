import React from 'react';
import styled from 'styled-components';
import Header from './components/header';
import BoardHeader from './components/board-header';
import Board from './components/board';

const Container = styled.div`
    width: 100%;
    height: 100%;
    background-color: #CFE7F6;
    display: flex;
    flex-direction: column;
`

const getLanes = () => {
  return [
    {
      name: "Lane 1",
      cards: [
        {
          name: "Card 1",
          content: "Example card"
        },
        {
          name: "Card 2",
          content: "Example card"
        },
        {
          name: "Card 3",
          content: "Example card"
        },
        {
          name: "Card 4",
          content: "Example card"
        }
      ]
    },
    {
      name: "Lane 2",
      cards: [
        {
          name: "Card 1",
          content: "Example card"
        },
        {
          name: "Card 2",
          content: "Example card"
        }
      ]
    },
    {
      name: "Lane 3",
      cards: []
    }
  ];
}

export default function App() {
  return (
    <Container>
      <Header/>
      <BoardHeader/>
      <Board lanes={getLanes()} />
    </Container>
  );
}