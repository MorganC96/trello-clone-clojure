import React from 'react';
import styled from 'styled-components';
import Lane from './lane';

const Container = styled.div`
    flex: 1;
    display: flex;
    flex-direction: row;
    overflow-x: auto;
    align-items: flex-start;
`

const getLanes = lanes => {
    return lanes.map(lane => <Lane name={lane.name} cards={lane.cards}/>);
}

export default (props) => {
    return (<Container>{getLanes(props.lanes)}</Container>);
}