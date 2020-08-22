import React from 'react';
import styled from 'styled-components';

export default (props) => {
    const Container = styled.div`
        width: 100%;
        box-sizing: border-box;
        background-clip: content-box;
        padding-left: 10px;
        border-radius: 15px;
    `

    const ContentContainer = styled.div`
        width: 100%;
        height: 100%;
        box-sizing: border-box;
        color: #959596;
    `

    return (<Container> 
        <ContentContainer> 
            Add a card...
        </ContentContainer> 
    </Container>);
}