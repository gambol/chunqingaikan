package com.tencent.connect.share; class a$4 { void a() { int a;
a=0;// .class final Lcom/tencent/connect/share/a$4;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/connect/share/a;->a(Landroid/content/Context;Ljava/util/ArrayList;Lcom/tencent/utils/AsynLoadImgBack;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/util/ArrayList;
a=0;// 
a=0;// .field final synthetic b:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/util/ArrayList;Landroid/os/Handler;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     iput-object p1, p0, Lcom/tencent/connect/share/a$4;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/connect/share/a$4;->b:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/share/a$4;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x2710
a=0;// 
a=0;//     .line 146
a=0;//     #v7=(PosShort);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/a$4;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/a$4;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 148
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->isValidUrl(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->fileExists(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     invoke-static {v0, v7}, Lcom/tencent/connect/share/a;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 154
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "/tmp/"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 156
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 157
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "share2qzone_temp"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ".jpg"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 161
a=0;//     const/16 v5, 0x280
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-static {v0, v5, v7}, Lcom/tencent/connect/share/a;->a(Ljava/lang/String;II)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     const-string v2, "AsynScaleCompressImage"
a=0;// 
a=0;//     const-string v3, "not out of bound,not compress!"
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 170
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v2, p0, Lcom/tencent/connect/share/a$4;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 166
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Reference,Landroid/graphics/Bitmap;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "AsynScaleCompressImage"
a=0;// 
a=0;//     const-string v5, "out of bound, compress!"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 167
a=0;//     invoke-static {v2, v3, v4}, Lcom/tencent/connect/share/a;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 176
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/a$4;->b:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/16 v1, 0x65
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 177
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 178
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "images"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/share/a$4;->a:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 179
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v1, p0, Lcom/tencent/connect/share/a$4;->b:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 181
a=0;//     return-void
a=0;// .end method
}}
