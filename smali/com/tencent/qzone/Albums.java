package com.tencent.qzone; class Albums { void a() { int a;
a=0;// .class public Lcom/tencent/qzone/Albums;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/qzone/Albums$AlbumSecurity;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Lcom/tencent/qzone/Albums;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Lcom/tencent/qzone/Albums;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addAlbum(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qzone/Albums$AlbumSecurity;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     invoke-virtual {p0}, Lcom/tencent/qzone/Albums;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 158
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "albumname"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const-string p1, ""
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 159
a=0;//     const-string v0, "albumdesc"
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     const-string p2, ""
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 160
a=0;//     const-string v1, "priv"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez p3, :cond_4
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/qzone/Albums$AlbumSecurity;->publicToAll:Lcom/tencent/qzone/Albums$AlbumSecurity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/qzone/Albums$AlbumSecurity;->getSecurity()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 161
a=0;//     const-string v0, "question"
a=0;// 
a=0;//     if-nez p4, :cond_2
a=0;// 
a=0;//     const-string p4, ""
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 162
a=0;//     const-string v0, "answer"
a=0;// 
a=0;//     if-nez p5, :cond_3
a=0;// 
a=0;//     const-string p5, ""
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 163
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p6}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 164
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/qzone/Albums;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/qzone/Albums;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "photo/add_album"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 166
a=0;//     return-void
a=0;// 
a=0;//     .line 160
a=0;//     :cond_4
a=0;//     #v2=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p3}, Lcom/tencent/qzone/Albums$AlbumSecurity;->getSecurity()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public listAlbum(Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     invoke-virtual {p0}, Lcom/tencent/qzone/Albums;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 70
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 72
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/qzone/Albums;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     iget-object v1, p0, Lcom/tencent/qzone/Albums;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "photo/list_album"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public listPhotos(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     invoke-virtual {p0}, Lcom/tencent/qzone/Albums;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 88
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "albumid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const-string p1, ""
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p2}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 90
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/qzone/Albums;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/qzone/Albums;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "photo/list_photo"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 92
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public uploadPicture(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p6}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 113
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 115
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v2, 0x400
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     new-array v2, v2, [B
a=0;// 
a=0;//     .line 117
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
a=0;//     .line 118
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 123
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 124
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v5, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->onIOException(Ljava/io/IOException;)V
a=0;// 
a=0;//     .line 142
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Reference,[B);v3=(Integer);v4=(Byte);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 122
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {p0}, Lcom/tencent/qzone/Albums;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 129
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 131
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const-string v2, "picture"
a=0;// 
a=0;//     invoke-virtual {v3, v2, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
a=0;// 
a=0;//     .line 132
a=0;//     const-string v0, "photodesc"
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     const-string p2, ""
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     const-string v0, "title"
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 134
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     .line 135
a=0;//     const-string v0, "albumid"
a=0;// 
a=0;//     if-nez p3, :cond_2
a=0;// 
a=0;//     const-string p3, ""
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 137
a=0;//     :cond_3
a=0;//     const-string v0, "x"
a=0;// 
a=0;//     if-nez p4, :cond_4
a=0;// 
a=0;//     const-string p4, ""
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 138
a=0;//     const-string v0, "y"
a=0;// 
a=0;//     if-nez p5, :cond_5
a=0;// 
a=0;//     const-string p5, ""
a=0;// 
a=0;//     :cond_5
a=0;//     invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v0, p0, Lcom/tencent/qzone/Albums;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/qzone/Albums;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "photo/upload_pic"
a=0;// 
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
