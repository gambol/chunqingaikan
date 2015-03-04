package com.tencent.t; class Weibo { void a() { int a;
a=0;// .class public Lcom/tencent/t/Weibo;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/tencent/t/Weibo;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/tencent/t/Weibo;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public atFriends(ILcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     invoke-virtual {p0}, Lcom/tencent/t/Weibo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 128
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "reqnum"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 129
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p2}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 130
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/t/Weibo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "friends/get_intimate_friends_weibo"
a=0;// 
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 132
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public deleteText(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     invoke-virtual {p0}, Lcom/tencent/t/Weibo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 140
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 141
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p2}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 142
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/t/Weibo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "t/del_t"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 143
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getWeiboInfo(Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-virtual {p0}, Lcom/tencent/t/Weibo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 46
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 47
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     iget-object v1, p0, Lcom/tencent/t/Weibo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "user/get_info"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public nickTips(Ljava/lang/String;ILcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     invoke-virtual {p0}, Lcom/tencent/t/Weibo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 112
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "match"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const-string p1, ""
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 113
a=0;//     const-string v0, "reqnum"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p3}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 115
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/t/Weibo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "friends/match_nick_tips_weibo"
a=0;// 
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 117
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public sendPicText(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p3}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 79
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, p2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 80
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 81
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v2, 0x400
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     new-array v2, v2, [B
a=0;// 
a=0;//     .line 83
a=0;//     :goto_0
a=0;//     #v2=(Reference,[B);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v5, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->onIOException(Ljava/io/IOException;)V
a=0;// 
a=0;//     .line 99
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Reference,[B);v3=(Integer);v4=(Byte);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {p0}, Lcom/tencent/t/Weibo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 95
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "content"
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const-string p1, ""
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {v3, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 96
a=0;//     const-string v1, "pic"
a=0;// 
a=0;//     invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/tencent/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/t/Weibo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "t/add_pic_t"
a=0;// 
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public sendText(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-virtual {p0}, Lcom/tencent/t/Weibo;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 60
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "content"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const-string p1, ""
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p2}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 62
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/t/Weibo;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "t/add_t"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
}}
