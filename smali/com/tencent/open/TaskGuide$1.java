package com.tencent.open; class TaskGuide$1 { void a() { int a;
a=0;// .class Lcom/tencent/open/TaskGuide$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/open/TaskGuide;->b(I)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:I
a=0;// 
a=0;// .field final synthetic b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/open/TaskGuide;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     iput-object p1, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     iput p2, p0, Lcom/tencent/open/TaskGuide$1;->a:I
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/open/TaskGuide$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 252
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 253
a=0;//     iget v0, p0, Lcom/tencent/open/TaskGuide$1;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/TaskGuide$i;
a=0;// 
a=0;//     .line 255
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v1}, Lcom/tencent/open/TaskGuide;->c(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$k;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/open/TaskGuide$i;->a(Lcom/tencent/open/TaskGuide$k;)V
a=0;// 
a=0;//     .line 268
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 256
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget v0, p0, Lcom/tencent/open/TaskGuide$1;->a:I
a=0;// 
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 257
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/TaskGuide$i;
a=0;// 
a=0;//     .line 258
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v1}, Lcom/tencent/open/TaskGuide;->d(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$k;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/open/TaskGuide$i;->a(Lcom/tencent/open/TaskGuide$k;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 259
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget v0, p0, Lcom/tencent/open/TaskGuide$1;->a:I
a=0;// 
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/TaskGuide$i;
a=0;// 
a=0;//     .line 261
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v1}, Lcom/tencent/open/TaskGuide;->c(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$k;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/open/TaskGuide$i;->a(Lcom/tencent/open/TaskGuide$k;)V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v2, :cond_0
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/TaskGuide$i;
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$1;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/open/TaskGuide;->d(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$k;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/open/TaskGuide$i;->a(Lcom/tencent/open/TaskGuide$k;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
