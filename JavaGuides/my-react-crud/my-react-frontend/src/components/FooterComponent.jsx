import React, { Component } from 'react';

export default class FooterComponent extends Component {
  constructor() {
    super();

    this.state = {
    };
  }
  render() {
    return (
      <div>
        <footer className='footer'>
          <span className='text-muted'>All rights reserved</span>
        </footer>
      </div>
    );
  }
}
