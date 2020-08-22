import React from 'react';
import styled from 'styled-components';
import Card from './card';
import LaneHeader from './lane-header';
import NoCards from './no-cards';

const getCards = cards => {
    if(cards.length) {
        return cards.map(card => <Card header={card.name} text={card.content}/>);
    }
    else {
        return (<NoCards/>);
    }
}

const Container = styled.div`
    min-width: 400px;
    max-width: 400px;
    width: 400px;
    min-height: 100px;
    max-height: 100%;
    background-color: #E9E8EB;
    box-sizing: border-box;
    background-clip: content-box;
    padding: 10px;
    border-radius: 10px;
    display: flex;
    flex-direction: column;
`

const CardContainer = styled.div`
    overflow-y: auto;
`

export default (props) => {

    return (<Container>
        <LaneHeader text={props.name}/>
        <CardContainer>
            {getCards(props.cards)}
        </CardContainer>
    </Container>);
}