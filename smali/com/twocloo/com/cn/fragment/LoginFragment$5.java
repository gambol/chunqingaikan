package com.twocloo.com.cn.fragment; class LoginFragment$5 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/LoginFragment$5;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoginFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/LoginFragment;->doBlurImage(Landroid/app/Activity;Ljava/io/File;Ljava/lang/String;Landroid/view/View;Ljava/lang/String;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;// .field private final synthetic val$act:Landroid/app/Activity;
a=0;// 
a=0;// .field private final synthetic val$blurredImage:Ljava/io/File;
a=0;// 
a=0;// .field private final synthetic val$cropImgpath:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$view:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/LoginFragment;Ljava/lang/String;Landroid/app/Activity;Ljava/io/File;Landroid/view/View;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->val$cropImgpath:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->val$blurredImage:Ljava/io/File;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->val$view:Landroid/view/View;
a=0;// 
a=0;//     .line 614
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/LoginFragment$5;)Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 614
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 617
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->val$cropImgpath:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 618
a=0;//     .local v0, "image":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v2, v0, v3}, Lcom/twocloo/com/cn/utils/Blur;->fastblur(Landroid/content/Context;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 619
a=0;//     .local v1, "newImg":Landroid/graphics/Bitmap;
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->val$blurredImage:Ljava/io/File;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/common/Util;->storeImage(Landroid/graphics/Bitmap;Ljava/io/File;)V
a=0;// 
a=0;//     .line 620
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/LoginFragment$5$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/LoginFragment$5$1;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->val$blurredImage:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$5;->val$view:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {v3, p0, v4, v5}, Lcom/twocloo/com/cn/fragment/LoginFragment$5$1;-><init>(Lcom/twocloo/com/cn/fragment/LoginFragment$5;Ljava/io/File;Landroid/view/View;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$5$1;);
a=0;//     invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 631
a=0;//     return-void
a=0;// .end method
}}
