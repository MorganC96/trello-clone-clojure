import React from 'react';
import styled from 'styled-components';
import TrelloLogo from './trello-logo'

const headerHeightPx = 50;
const logoHeightPx = 40;
const logoHeight = `${logoHeightPx}px`
const headerOpacity = 0.3;

const Container = styled.div`
    width: 100%;
    height: ${headerHeightPx}px;
    background-color: black;
    opacity: ${headerOpacity};
    display: flex;
`

export default (props) => {
    return (<Container>
        <TrelloLogo fill="white" innerFill="grey" height={logoHeight} />
    </Container>);
}