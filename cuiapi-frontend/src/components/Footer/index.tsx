import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import React from 'react';

const Footer: React.FC = () => {
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      links={[
        // {
        //   key: 'Ant Design Pro',
        //   title: 'Ant Design Pro',
        //   href: 'https://pro.ant.design',
        //   blankTarget: true,
        // },
        {
          key: 'codeNav',
          title: <GithubOutlined />,
          href: 'https://github.com/Cui-zi',
          blankTarget: true,
        },
        {
          key: 'github',
          title: '子裕出品',
          href: 'https://github.com/Cui-zi',
          blankTarget: true,
        },
      ]}
    />
  );
};

export default Footer;
