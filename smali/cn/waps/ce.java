package cn.waps; class ce { void a() { int a;
a=0;// .class Lcn/waps/ce;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/waps/cd;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/cd;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/ce;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget v0, v0, Lcn/waps/bw;->c:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v1, v1, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget v1, v1, Lcn/waps/bw;->d:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x42c80000    # 100.0f
a=0;// 
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v1, v1, Lcn/waps/cd;->c:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v1, v1, Lcn/waps/cd;->d:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Lcn/waps/bw;->b:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v1, v1, Lcn/waps/cd;->e:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v2, Lcn/waps/bw;->b:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/bw;->a(Lcn/waps/bw;Landroid/content/Context;Ljava/util/List;)Lcn/waps/AdInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v2, v2, Lcn/waps/cd;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v3, v3, Lcn/waps/cd;->f:Landroid/app/Dialog;
a=0;// 
a=0;//     iget-object v4, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/cd;);
a=0;//     iget v4, v4, Lcn/waps/cd;->g:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v5=(Reference,Lcn/waps/cd;);
a=0;//     iget v5, v5, Lcn/waps/cd;->h:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static/range {v0 .. v5}, Lcn/waps/bw;->a(Lcn/waps/bw;Lcn/waps/AdInfo;Landroid/content/Context;Landroid/app/Dialog;II)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v2, v2, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v3, v3, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v1, v3, v0}, Lcn/waps/bw;->a(Lcn/waps/bw;Lcn/waps/AdInfo;Landroid/widget/ViewFlipper;Landroid/widget/LinearLayout;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget v0, v0, Lcn/waps/bw;->c:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v1, v1, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget v1, v1, Lcn/waps/bw;->d:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, -0x3d380000    # -100.0f
a=0;// 
a=0;//     cmpg-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v1, v1, Lcn/waps/cd;->i:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v1, v1, Lcn/waps/cd;->j:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showPrevious()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Lcn/waps/bw;->b:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v1, v1, Lcn/waps/cd;->e:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v2, Lcn/waps/bw;->b:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/bw;->a(Lcn/waps/bw;Landroid/content/Context;Ljava/util/List;)Lcn/waps/AdInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v2, v2, Lcn/waps/cd;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/cd;);
a=0;//     iget-object v3, v3, Lcn/waps/cd;->f:Landroid/app/Dialog;
a=0;// 
a=0;//     iget-object v4, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/cd;);
a=0;//     iget v4, v4, Lcn/waps/cd;->g:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     #v5=(Reference,Lcn/waps/cd;);
a=0;//     iget v5, v5, Lcn/waps/cd;->h:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static/range {v0 .. v5}, Lcn/waps/bw;->a(Lcn/waps/bw;Lcn/waps/AdInfo;Landroid/content/Context;Landroid/app/Dialog;II)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v2, v2, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/ce;->a:Lcn/waps/cd;
a=0;// 
a=0;//     iget-object v3, v3, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v1, v3, v0}, Lcn/waps/bw;->a(Lcn/waps/bw;Lcn/waps/AdInfo;Landroid/widget/ViewFlipper;Landroid/widget/LinearLayout;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
