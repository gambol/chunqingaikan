package com.twocloo.base.common; class LoadLayerProvider { void a() { int a;
a=0;// .class public Lcom/twocloo/base/common/LoadLayerProvider;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoadLayerProvider.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile instance:Lcom/twocloo/base/common/LoadLayerProvider;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private load:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     new-instance v0, Lcom/twocloo/base/common/LoadLayerProvider;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/common/LoadLayerProvider;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/base/common/LoadLayerProvider;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/LoadLayerProvider;);
a=0;//     sput-object v0, Lcom/twocloo/base/common/LoadLayerProvider;->instance:Lcom/twocloo/base/common/LoadLayerProvider;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/LoadLayerProvider;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/base/common/LoadLayerProvider;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lcom/twocloo/base/common/LoadLayerProvider;->load:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Lcom/twocloo/base/common/LoadLayerProvider;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     sget-object v0, Lcom/twocloo/base/common/LoadLayerProvider;->instance:Lcom/twocloo/base/common/LoadLayerProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/LoadLayerProvider;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/base/common/LoadLayerProvider;->load:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/base/common/LoadLayerProvider;->load:Landroid/view/View;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/base/common/LoadLayerProvider$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/base/common/LoadLayerProvider$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/base/common/LoadLayerProvider$1;-><init>(Lcom/twocloo/base/common/LoadLayerProvider;)V
a=0;// 
a=0;//     .line 60
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/LoadLayerProvider$1;);
a=0;//     const-wide/16 v2, 0x1f4
a=0;// 
a=0;//     .line 54
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public open()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 31
a=0;//     #v1=(Byte);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/common/LoadLayerProvider;->load:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/base/R$layout;->loading:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/base/common/LoadLayerProvider;->load:Landroid/view/View;
a=0;// 
a=0;//     .line 36
a=0;//     new-instance v0, Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/WindowManager$LayoutParams;);
a=0;//     const/high16 v3, 0x80000
a=0;// 
a=0;//     .line 37
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, -0x3
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 36
a=0;//     #v2=(Byte);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V
a=0;// 
a=0;//     .line 38
a=0;//     .local v0, "params":Landroid/view/WindowManager$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     const/16 v1, 0x30
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 41
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Application;);
a=0;//     const-string v2, "window"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Landroid/view/WindowManager;
a=0;// 
a=0;//     .line 42
a=0;//     .local v6, "vm":Landroid/view/WindowManager;
a=0;//     iget-object v1, p0, Lcom/twocloo/base/common/LoadLayerProvider;->load:Landroid/view/View;
a=0;// 
a=0;//     invoke-interface {v6, v1, v0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 45
a=0;//     .end local v0    # "params":Landroid/view/WindowManager$LayoutParams;
a=0;//     .end local v6    # "vm":Landroid/view/WindowManager;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/common/LoadLayerProvider;->load:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v1, p0, Lcom/twocloo/base/common/LoadLayerProvider;->load:Landroid/view/View;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ujava/lang/Object;);
a=0;//     return-void
a=0;// .end method
}}
