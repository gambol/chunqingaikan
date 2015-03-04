package com.twocloo.com.cn.activitys; class ShareInfoActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareInfoActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     .line 133
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;);
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
a=0;//     .line 136
a=0;//     #v5=(Null);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->access$1(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->Shubenxinxiye(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 137
a=0;//     .local v2, "sbxxy":Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/Shubenxinxiye;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->bookname:Ljava/lang/String;
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getBook_logo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->booklogo:Ljava/lang/String;
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->description:Ljava/lang/String;
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->getSortname()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v3, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->sortname:Ljava/lang/String;
a=0;// 
a=0;//     .line 142
a=0;//     :try_start_0
a=0;//     new-instance v1, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 143
a=0;//     .local v1, "options":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v1=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->booklogo:Ljava/lang/String;
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
a=0;//     iput-object v4, v3, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->thumb:Landroid/graphics/Bitmap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 148
a=0;//     .end local v1    # "options":Landroid/graphics/BitmapFactory$Options;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->booklogo:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->thumb:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/Util;->saveBookcoverToSD(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->access$2(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0x2711
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 150
a=0;//     return-void
a=0;// 
a=0;//     .line 145
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Conflicted);v4=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 146
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
