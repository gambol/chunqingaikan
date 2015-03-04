package com.tencent.connect.share; class a$2 { void a() { int a;
a=0;// .class final Lcom/tencent/connect/share/a$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/connect/share/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/utils/AsynLoadImgBack;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic b:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iput-object p1, p0, Lcom/tencent/connect/share/a$2;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/connect/share/a$2;->b:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/share/a$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x8c
a=0;// 
a=0;//     .line 83
a=0;//     #v5=(PosShort);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/a$2;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v5}, Lcom/tencent/connect/share/a;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 84
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/tmp/"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v2, p0, Lcom/tencent/connect/share/a$2;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "share2qq_temp"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".jpg"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v3, p0, Lcom/tencent/connect/share/a$2;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3, v5, v5}, Lcom/tencent/connect/share/a;->a(Ljava/lang/String;II)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     const-string v0, "AsynScaleCompressImage"
a=0;// 
a=0;//     const-string v1, "not out of bound,not compress!"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/a$2;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 98
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v1, p0, Lcom/tencent/connect/share/a$2;->b:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v2, 0x65
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 100
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/a$2;->b:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 108
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "AsynScaleCompressImage"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "out of bound,compress!"
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 95
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/connect/share/a;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 105
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/a$2;->b:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v1, 0x66
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     iput v1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v1, p0, Lcom/tencent/connect/share/a$2;->b:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
