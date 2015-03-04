package com.tencent.mm.sdk.modelmsg; class WXImageObject { void a() { int a;
a=0;// .class public Lcom/tencent/mm/sdk/modelmsg/WXImageObject;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CONTENT_LENGTH_LIMIT:I = 0xa00000
a=0;// 
a=0;// .field private static final PATH_LENGTH_LIMIT:I = 0x2800
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "MicroMsg.SDK.WXImageObject"
a=0;// 
a=0;// .field private static final URL_LENGTH_LIMIT:I = 0x2800
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public imageData:[B
a=0;// 
a=0;// .field public imagePath:Ljava/lang/String;
a=0;// 
a=0;// .field public imageUrl:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXImageObject;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/graphics/Bitmap;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXImageObject;);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v2, 0x55
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageData:[B
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>([B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXImageObject;);
a=0;//     iput-object p1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageData:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getFileSize(Ljava/lang/String;)I
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkArgs()Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/high16 v3, 0xa00000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v2, 0x2800
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageData:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageData:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imagePath:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imagePath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "MicroMsg.SDK.WXImageObject"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, all arguments are null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Integer);v2=(PosShort);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageData:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageData:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v3, :cond_4
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXImageObject"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, content is too large"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(PosShort);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imagePath:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imagePath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v2, :cond_5
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXImageObject"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, path is invalid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(PosShort);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imagePath:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imagePath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->getFileSize(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v3, :cond_6
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXImageObject"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, image content is too large"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v2=(PosShort);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v2, :cond_7
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXImageObject"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, url is invalid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v2=(PosShort);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public serialize(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "_wximageobject_imageData"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageData:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
a=0;// 
a=0;//     const-string v0, "_wximageobject_imagePath"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imagePath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wximageobject_imageUrl"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImagePath(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imagePath:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public type()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public unserialize(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "_wximageobject_imageData"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageData:[B
a=0;// 
a=0;//     const-string v0, "_wximageobject_imagePath"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imagePath:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wximageobject_imageUrl"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;->imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
