import React from 'react';
import styled from 'styled-components';

const headerHeightPx = 50;
const headerPadding = 15;

const Container = styled.div`
    width: 100%;
    height: ${headerHeightPx}px;
    display: flex;
    padding-left: ${headerPadding}px;
    padding-right: ${headerPadding}px;
    box-sizing: border-box;
`

const HeaderText = styled.h3`
    margin-top: auto;
    margin-bottom: auto;
    width: 100%;
    white-space: nowrap;
    color: #58646B;
`


export default (props) => {
    return (<Container>
        <HeaderText>House Renovation</HeaderText>
    </Container>);
}