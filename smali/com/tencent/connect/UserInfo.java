package com.tencent.connect; class UserInfo { void a() { int a;
a=0;// .class public Lcom/tencent/connect/UserInfo;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final GRAPH_OPEN_ID:Ljava/lang/String; = "oauth2.0/m_me"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/tencent/connect/UserInfo;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/tencent/connect/UserInfo;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getOpenId(Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/UserInfo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 67
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 68
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/UserInfo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/UserInfo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "oauth2.0/m_me"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getTenPayAddr(Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/UserInfo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 55
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "ver"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 57
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/UserInfo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/UserInfo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "cft_info/get_tenpay_addr"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getUserInfo(Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/UserInfo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 30
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 31
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/UserInfo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/UserInfo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "user/get_simple_userinfo"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getVipUserInfo(Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/UserInfo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 37
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 38
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/UserInfo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/UserInfo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "user/get_vip_info"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getVipUserRichInfo(Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/UserInfo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 44
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 45
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/UserInfo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/UserInfo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "user/get_vip_rich_info"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
}}
