package com.tencent.mm.sdk.modelmsg; class WXMediaMessage { void a() { int a;
a=0;// .class public final Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$Builder;,
a=0;//         Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ACTION_WXAPPMESSAGE:Ljava/lang/String; = "com.tencent.mm.sdk.openapi.Intent.ACTION_WXAPPMESSAGE"
a=0;// 
a=0;// .field private static final DESCRIPTION_LENGTH_LIMIT:I = 0x400
a=0;// 
a=0;// .field private static final MEDIA_TAG_NAME_LENGTH_LIMIT:I = 0x40
a=0;// 
a=0;// .field private static final MESSAGE_ACTION_LENGTH_LIMIT:I = 0x800
a=0;// 
a=0;// .field private static final MESSAGE_EXT_LENGTH_LIMIT:I = 0x800
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "MicroMsg.SDK.WXMediaMessage"
a=0;// 
a=0;// .field private static final THUMB_LENGTH_LIMIT:I = 0x8000
a=0;// 
a=0;// .field private static final TITLE_LENGTH_LIMIT:I = 0x200
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public description:Ljava/lang/String;
a=0;// 
a=0;// .field public mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;// .field public mediaTagName:Ljava/lang/String;
a=0;// 
a=0;// .field public messageAction:Ljava/lang/String;
a=0;// 
a=0;// .field public messageExt:Ljava/lang/String;
a=0;// 
a=0;// .field public sdkVer:I
a=0;// 
a=0;// .field public thumbData:[B
a=0;// 
a=0;// .field public title:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;-><init>(Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     iput-object p1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method final checkArgs()Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v3, 0x800
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->getType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "MicroMsg.SDK.WXMediaMessage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, thumbData should not be null when send emoji"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(PosByte);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const v2, 0x8000
a=0;// 
a=0;//     #v2=(Char);
a=0;//     if-le v1, v2, :cond_2
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXMediaMessage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, thumbData is invalid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Char);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x200
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le v1, v2, :cond_3
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXMediaMessage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, title is invalid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Char);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x400
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le v1, v2, :cond_4
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXMediaMessage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, description is invalid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Char);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXMediaMessage"
a=0;// 
a=0;//     const-string v2, "checkArgs fail, mediaObject is null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Char);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaTagName:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaTagName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x40
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_6
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXMediaMessage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, mediaTagName is too long"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v2=(Char);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->messageAction:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->messageAction:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v3, :cond_7
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXMediaMessage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, messageAction is too long"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v2=(Char);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->messageExt:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->messageExt:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v3, :cond_8
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXMediaMessage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, messageExt is too long"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v2=(Char);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;);
a=0;//     invoke-interface {v0}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;->checkArgs()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getType()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;->type()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final setThumbImage(Landroid/graphics/Bitmap;)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
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
a=0;//     iput-object v1, p0, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const-string v0, "MicroMsg.SDK.WXMediaMessage"
a=0;// 
a=0;//     const-string v1, "put thumb failed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
