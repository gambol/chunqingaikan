package com.tencent.weiyun; class RecordManager { void a() { int a;
a=0;// .class public Lcom/tencent/weiyun/RecordManager;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/RecordManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/RecordManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkRecord(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     invoke-virtual {p0}, Lcom/tencent/weiyun/RecordManager;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 261
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v0, Lcom/tencent/weiyun/RecordManager$6;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/RecordManager$6;);
a=0;//     invoke-direct {v0, p0, p2}, Lcom/tencent/weiyun/RecordManager$6;-><init>(Lcom/tencent/weiyun/RecordManager;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 286
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/RecordManager$6;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 287
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     const-string v0, "key"
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->toHexString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/RecordManager;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/RecordManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "https://graph.qq.com/weiyun/check_record"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 290
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public createRecord(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-virtual {p0}, Lcom/tencent/weiyun/RecordManager;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 47
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v0, Lcom/tencent/weiyun/RecordManager$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/RecordManager$1;);
a=0;//     invoke-direct {v0, p0, p3}, Lcom/tencent/weiyun/RecordManager$1;-><init>(Lcom/tencent/weiyun/RecordManager;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 72
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/RecordManager$1;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 73
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     const-string v0, "key"
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->toHexString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 74
a=0;//     const-string v0, "value"
a=0;// 
a=0;//     invoke-static {p2}, Lcom/tencent/utils/Util;->toHexString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/RecordManager;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/RecordManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "https://graph.qq.com/weiyun/create_record"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public deleteRecord(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     invoke-virtual {p0}, Lcom/tencent/weiyun/RecordManager;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 88
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v0, Lcom/tencent/weiyun/RecordManager$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/RecordManager$2;);
a=0;//     invoke-direct {v0, p0, p2}, Lcom/tencent/weiyun/RecordManager$2;-><init>(Lcom/tencent/weiyun/RecordManager;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 114
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/RecordManager$2;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 115
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     const-string v0, "key"
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->toHexString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/RecordManager;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/RecordManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "https://graph.qq.com/weiyun/delete_record"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 118
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getRecord(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     invoke-virtual {p0}, Lcom/tencent/weiyun/RecordManager;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 128
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v0, Lcom/tencent/weiyun/RecordManager$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/RecordManager$3;);
a=0;//     invoke-direct {v0, p0, p2}, Lcom/tencent/weiyun/RecordManager$3;-><init>(Lcom/tencent/weiyun/RecordManager;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 157
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/RecordManager$3;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 158
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     const-string v0, "key"
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->toHexString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/RecordManager;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/RecordManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "https://graph.qq.com/weiyun/get_record"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public modifyRecord(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     invoke-virtual {p0}, Lcom/tencent/weiyun/RecordManager;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 172
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v0, Lcom/tencent/weiyun/RecordManager$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/RecordManager$4;);
a=0;//     invoke-direct {v0, p0, p3}, Lcom/tencent/weiyun/RecordManager$4;-><init>(Lcom/tencent/weiyun/RecordManager;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 197
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/RecordManager$4;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 198
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     const-string v0, "key"
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->toHexString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 199
a=0;//     const-string v0, "value"
a=0;// 
a=0;//     invoke-static {p2}, Lcom/tencent/utils/Util;->toHexString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/RecordManager;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/RecordManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "https://graph.qq.com/weiyun/modify_record"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public queryAllRecord(Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-virtual {p0}, Lcom/tencent/weiyun/RecordManager;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 214
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v0, Lcom/tencent/weiyun/RecordManager$5;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/weiyun/RecordManager$5;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/tencent/weiyun/RecordManager$5;-><init>(Lcom/tencent/weiyun/RecordManager;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 248
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/RecordManager$5;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 249
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/RecordManager;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/RecordManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "https://graph.qq.com/weiyun/query_all_record"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 251
a=0;//     return-void
a=0;// .end method
}}
