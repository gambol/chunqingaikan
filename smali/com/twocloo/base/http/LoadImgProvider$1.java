package com.twocloo.base.http; class LoadImgProvider$1 { void a() { int a;
a=0;// .class Lcom/twocloo/base/http/LoadImgProvider$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoadImgProvider.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/base/http/LoadImgProvider;->doLoadImageAsyn(Ljava/lang/String;Landroid/widget/ImageView;Landroid/widget/ImageView$ScaleType;Z)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;// .field private final synthetic val$imageUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$imageView:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private final synthetic val$scaleType:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/http/LoadImgProvider;Landroid/widget/ImageView;Ljava/lang/String;Landroid/widget/ImageView$ScaleType;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->this$0:Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->val$imageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->val$imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->val$scaleType:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     .line 157
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/http/LoadImgProvider$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/base/http/LoadImgProvider$1;)Lcom/twocloo/base/http/LoadImgProvider;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->this$0:Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/http/LoadImgProvider;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v2, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->val$imageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 162
a=0;//     .local v2, "iv":Landroid/widget/ImageView;
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->val$imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/HttpUtils;->loadImage(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 164
a=0;//     .local v4, "bm":Landroid/graphics/Bitmap;
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u7f51\u7edc\u52a0\u8f7d\u56fe\u7247\u5931\u8d25|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->val$imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 186
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->this$0:Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/http/LoadImgProvider;->access$0(Lcom/twocloo/base/http/LoadImgProvider;)Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->val$imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v4}, Lcom/twocloo/base/cache/Cache;->put(Ljava/lang/String;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 170
a=0;//     .local v6, "result":Z
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 171
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u653e\u5165\u5b58\u50a8\u5361\u5931\u8d25|"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->val$imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 172
a=0;//     :cond_1
a=0;//     invoke-static {}, Lcom/twocloo/base/http/LoadImgProvider;->access$1()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v0, Lcom/twocloo/base/http/LoadImgProvider$1$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/http/LoadImgProvider$1$1;);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->val$scaleType:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     iget-object v5, p0, Lcom/twocloo/base/http/LoadImgProvider$1;->val$imageUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/base/http/LoadImgProvider$1$1;-><init>(Lcom/twocloo/base/http/LoadImgProvider$1;Landroid/widget/ImageView;Landroid/widget/ImageView$ScaleType;Landroid/graphics/Bitmap;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 184
a=0;//     #v0=(Reference,Lcom/twocloo/base/http/LoadImgProvider$1$1;);
a=0;//     const-wide/16 v8, 0x3e8
a=0;// 
a=0;//     .line 172
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-virtual {v7, v0, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
