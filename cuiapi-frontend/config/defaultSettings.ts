import { ProLayoutProps } from '@ant-design/pro-components';

/**
 * @name
 */
const Settings: ProLayoutProps & {
  pwa?: boolean;
  logo?: string;
} = {
  navTheme: 'light',
  // 拂晓蓝
  colorPrimary: '#1890ff',
  layout: 'mix',
  contentWidth: 'Fluid',
  fixedHeader: false,
  fixSiderbar: true,
  colorWeak: false,
  title: '云桥API开放平台',
  pwa: true,
  logo: 'https://himg.bdimg.com/sys/portrait/item/public.1.82d0a505.hd1F2_fxqGv1nPtIozr6cQ?tt=1723650134620',
  iconfontUrl: '',
  token: {
    // 参见ts声明，demo 见文档，通过token 修改样式
    //https://procomponents.ant.design/components/layout#%E9%80%9A%E8%BF%87-token-%E4%BF%AE%E6%94%B9%E6%A0%B7%E5%BC%8F
  },
};

export default Settings;

//个人图标https://himg.bdimg.com/sys/portrait/item/public.1.82d0a505.hd1F2_fxqGv1nPtIozr6cQ?tt=1723650134620
//蚂蚁金服自带的图标https://gw.alipayobjects.com/zos/rmsportal/KDpgvguMpGfqaHPjicRK.svg
