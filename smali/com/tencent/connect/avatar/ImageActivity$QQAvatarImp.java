package com.tencent.connect.avatar; class ImageActivity$QQAvatarImp { void a() { int a;
a=0;// .class Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/avatar/ImageActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "QQAvatarImp"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/connect/avatar/ImageActivity;Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 517
a=0;//     iput-object p1, p0, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     .line 518
a=0;//     invoke-direct {p0, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 519
a=0;//     #p0=(Reference,Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public setAvator(Landroid/graphics/Bitmap;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 522
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 523
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 524
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v2, 0x28
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 525
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 526
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 527
a=0;//     new-instance v5, Lcom/tencent/connect/common/BaseApi$TempRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     invoke-direct {v5, p0, p2}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 528
a=0;//     #v5=(Reference,Lcom/tencent/connect/common/BaseApi$TempRequestListener;);
a=0;//     const-string v1, "picture"
a=0;// 
a=0;//     invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
a=0;// 
a=0;//     .line 529
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "user/set_user_face"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 532
a=0;//     return-void
a=0;// .end method
}}
