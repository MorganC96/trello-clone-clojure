import React from 'react';
import styled from 'styled-components';

export default (props) => {
    const Container = styled.div`
        width: 100%;
        min-height: 50px;
        box-sizing: border-box;
        background-clip: content-box;
        padding: 10px;
        border-radius: 15px;
    `

    const ContentContainer = styled.div`
        width: 100%;
        height: 100%;
        padding: 10px;
        box-sizing: border-box;
    `

    return (<Container> 
        <ContentContainer> 
            No Cards. You should create some. 
        </ContentContainer> 
    </Container>);
}