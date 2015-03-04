package com.twocloo.com.cn.common; class ShareToSNS$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/common/ShareToSNS$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareToSNS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/common/ShareToSNS;->shareWeixin(I)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/common/ShareToSNS;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     .line 261
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 264
a=0;//     #v5=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$1(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/app/Activity;
a=0;// 
a=0;//     sget-object v4, Lcom/twocloo/com/cn/common/ShareToSNS;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->Shubenxinxiye(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 265
a=0;//     .local v2, "sbxxy":Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/Shubenxinxiye;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 267
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Reference,Ljava/lang/String;);v5=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$8(Lcom/twocloo/com/cn/common/ShareToSNS;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getBook_logo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$9(Lcom/twocloo/com/cn/common/ShareToSNS;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$10(Lcom/twocloo/com/cn/common/ShareToSNS;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getSortname()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$11(Lcom/twocloo/com/cn/common/ShareToSNS;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 272
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$12(Lcom/twocloo/com/cn/common/ShareToSNS;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 273
a=0;//     new-instance v1, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 274
a=0;//     .local v1, "options":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v1=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$12(Lcom/twocloo/com/cn/common/ShareToSNS;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/Util;->getImageStream(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-static {v4, v5, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$13(Lcom/twocloo/com/cn/common/ShareToSNS;Landroid/graphics/Bitmap;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 282
a=0;//     .end local v1    # "options":Landroid/graphics/BitmapFactory$Options;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$14(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0x2710
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 277
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/ShareToSNS$2;->this$0:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$1(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/ShareToSNS;->access$13(Lcom/twocloo/com/cn/common/ShareToSNS;Landroid/graphics/Bitmap;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 279
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 280
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
