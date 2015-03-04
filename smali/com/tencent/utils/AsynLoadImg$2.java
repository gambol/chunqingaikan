package com.tencent.utils; class AsynLoadImg$2 { void a() { int a;
a=0;// .class Lcom/tencent/utils/AsynLoadImg$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/utils/AsynLoadImg;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/utils/AsynLoadImg;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     iput-object p1, p0, Lcom/tencent/utils/AsynLoadImg$2;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/utils/AsynLoadImg$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     #v1=(Null);
a=0;//     const-string v0, "AsynLoadImg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "saveFileRunnable:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/tencent/utils/AsynLoadImg$2;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/AsynLoadImg;->b(Lcom/tencent/utils/AsynLoadImg;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 145
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "share_qq_"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ".jpg"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 146
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/tencent/utils/AsynLoadImg;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 148
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     iget-object v4, p0, Lcom/tencent/utils/AsynLoadImg$2;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/utils/AsynLoadImg;);
a=0;//     invoke-static {v4}, Lcom/tencent/utils/AsynLoadImg;->c(Lcom/tencent/utils/AsynLoadImg;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 151
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 152
a=0;//     iput v1, v4, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 153
a=0;//     iput-object v2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 154
a=0;//     const-string v0, "AsynLoadImg"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "file exists: time:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v5, p0, Lcom/tencent/utils/AsynLoadImg$2;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/utils/AsynLoadImg;);
a=0;//     invoke-static {v5}, Lcom/tencent/utils/AsynLoadImg;->d(Lcom/tencent/utils/AsynLoadImg;)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long/2addr v2, v5
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 182
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/tencent/utils/AsynLoadImg$2;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/AsynLoadImg;->c(Lcom/tencent/utils/AsynLoadImg;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 183
a=0;//     return-void
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/String;);v3=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v3, p0, Lcom/tencent/utils/AsynLoadImg$2;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/utils/AsynLoadImg;);
a=0;//     invoke-static {v3}, Lcom/tencent/utils/AsynLoadImg;->b(Lcom/tencent/utils/AsynLoadImg;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/utils/AsynLoadImg;->getbitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 158
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v5, p0, Lcom/tencent/utils/AsynLoadImg$2;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/utils/AsynLoadImg;);
a=0;//     invoke-virtual {v5, v3, v0}, Lcom/tencent/utils/AsynLoadImg;->saveFile(Landroid/graphics/Bitmap;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 163
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v5=(Conflicted);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 164
a=0;//     iput v1, v4, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 165
a=0;//     iput-object v2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 169
a=0;//     :goto_2
a=0;//     const-string v0, "AsynLoadImg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "file not exists: download time:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v5, p0, Lcom/tencent/utils/AsynLoadImg$2;->a:Lcom/tencent/utils/AsynLoadImg;
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/utils/AsynLoadImg;);
a=0;//     invoke-static {v5}, Lcom/tencent/utils/AsynLoadImg;->d(Lcom/tencent/utils/AsynLoadImg;)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long/2addr v2, v5
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 161
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/String;);v3=(Reference,Landroid/graphics/Bitmap;);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v0, "AsynLoadImg"
a=0;// 
a=0;//     const-string v3, "saveFileRunnable:get bmp fail---"
a=0;// 
a=0;//     invoke-static {v0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 167
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v5=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, v4, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
