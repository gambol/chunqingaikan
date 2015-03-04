package cn.waps.a; class n { void a() { int a;
a=0;// .class public Lcn/waps/a/n;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/a/n;);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcn/waps/a/n;->a:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcn/waps/a/n;->a:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/temp.jpg"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     new-instance v2, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v4, 0x32
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p1, v3, v4, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Lcom/tencent/mm/sdk/openapi/IWXAPI;Lcn/waps/a/p;)V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/openapi/WXTextObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/openapi/WXTextObject;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/openapi/WXTextObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/WXTextObject;);
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/openapi/WXTextObject;->text:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/openapi/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/WXMediaMessage;);
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/openapi/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;);
a=0;//     const-string v2, "sendText"
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcn/waps/a/n;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->transaction:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/openapi/WXMediaMessage;
a=0;// 
a=0;//     iget v1, p0, Lcn/waps/a/n;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     invoke-interface {p1, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/sdk/openapi/BaseReq;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b(Lcom/tencent/mm/sdk/openapi/IWXAPI;Lcn/waps/a/p;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v3, 0x96
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->d()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-direct {p0, v0}, Lcn/waps/a/n;->a(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/openapi/WXFileObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/openapi/WXFileObject;);
a=0;//     invoke-direct {v1, v0}, Lcom/tencent/mm/sdk/openapi/WXFileObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/WXFileObject;);
a=0;//     new-instance v2, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/mm/sdk/openapi/WXMediaMessage;);
a=0;//     invoke-direct {v2, v1}, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;-><init>(Lcom/tencent/mm/sdk/openapi/WXMediaMessage$IMediaObject;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/mm/sdk/openapi/WXMediaMessage;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v3, v3, v1}, Lcn/waps/a/o;->a(Ljava/lang/String;IIZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->setThumbImage(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;);
a=0;//     const-string v1, "sendTextAndImage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1}, Lcn/waps/a/n;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->transaction:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/openapi/WXMediaMessage;
a=0;// 
a=0;//     iget v1, p0, Lcn/waps/a/n;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     invoke-interface {p1, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/sdk/openapi/BaseReq;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected c(Lcom/tencent/mm/sdk/openapi/IWXAPI;Lcn/waps/a/p;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/16 v4, 0x96
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->d()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-static {v0, v3}, Lcn/waps/a/o;->a(Landroid/graphics/Bitmap;Z)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/openapi/WXImageObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/openapi/WXImageObject;);
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->d()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-direct {v1, v2}, Lcom/tencent/mm/sdk/openapi/WXImageObject;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/WXImageObject;);
a=0;//     new-instance v2, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/mm/sdk/openapi/WXMediaMessage;);
a=0;//     invoke-direct {v2}, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/mm/sdk/openapi/WXMediaMessage;);
a=0;//     invoke-static {v0, v4, v4, v3}, Lcn/waps/a/o;->a([BIIZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->setThumbImage(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     iput-object v1, v2, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/openapi/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;);
a=0;//     const-string v1, "sendImage"
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcn/waps/a/n;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->transaction:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/openapi/WXMediaMessage;
a=0;// 
a=0;//     iget v1, p0, Lcn/waps/a/n;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     invoke-interface {p1, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/sdk/openapi/BaseReq;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected d(Lcom/tencent/mm/sdk/openapi/IWXAPI;Lcn/waps/a/p;)V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/openapi/WXWebpageObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/openapi/WXWebpageObject;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/openapi/WXWebpageObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/WXWebpageObject;);
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/openapi/WXWebpageObject;->webpageUrl:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/openapi/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/WXMediaMessage;);
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/openapi/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     const-string v0, " "
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;);
a=0;//     const-string v2, "sendUrl"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v2}, Lcn/waps/a/n;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->transaction:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/openapi/WXMediaMessage;
a=0;// 
a=0;//     iget v1, p0, Lcn/waps/a/n;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     invoke-interface {p1, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/sdk/openapi/BaseReq;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected e(Lcom/tencent/mm/sdk/openapi/IWXAPI;Lcn/waps/a/p;)V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/openapi/WXWebpageObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/openapi/WXWebpageObject;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/openapi/WXWebpageObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/WXWebpageObject;);
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/openapi/WXWebpageObject;->webpageUrl:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/openapi/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/WXMediaMessage;);
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->d()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->setThumbImage(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/openapi/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2}, Lcn/waps/a/p;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/openapi/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;);
a=0;//     const-string v2, "sendUrl"
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcn/waps/a/n;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->transaction:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/openapi/WXMediaMessage;
a=0;// 
a=0;//     iget v1, p0, Lcn/waps/a/n;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/tencent/mm/sdk/openapi/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     invoke-interface {p1, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/sdk/openapi/BaseReq;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
