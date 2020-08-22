import React from 'react';
import styled from 'styled-components';
import CardHeader from './card-header';

export default (props) => {
    const Container = styled.div`
        background-color: white;
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

    const Content = styled.div`
        min-height: 25px;
        width: 100%;
        padding-left: 10px;
        padding-right: 10px;
        box-sizing: border-box;
    `

    return (<Container>
        <ContentContainer>
            <CardHeader text={props.header}/>
            <Content>{props.text}</Content>
        </ContentContainer>
    </Container>);
}