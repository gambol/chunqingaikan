package com.tencent.open; class TaskGuide$i { void a() { int a;
a=0;// .class Lcom/tencent/open/TaskGuide$i;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/open/TaskGuide;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "i"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;// .field private b:Landroid/widget/TextView;
a=0;// 
a=0;// .field private c:Landroid/widget/Button;
a=0;// 
a=0;// .field private d:Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/open/TaskGuide;Landroid/content/Context;Lcom/tencent/open/TaskGuide$g;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 372
a=0;//     iput-object p1, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     .line 373
a=0;//     invoke-direct {p0, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 374
a=0;//     #p0=(Reference,Lcom/tencent/open/TaskGuide$i;);
a=0;//     iput-object p3, p0, Lcom/tencent/open/TaskGuide$i;->d:Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     .line 375
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/TaskGuide$i;->setOrientation(I)V
a=0;// 
a=0;//     .line 376
a=0;//     invoke-direct {p0}, Lcom/tencent/open/TaskGuide$i;->a()V
a=0;// 
a=0;//     .line 377
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0xd3
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     const/16 v6, 0xc7
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     const/16 v5, 0xff
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 387
a=0;//     #v3=(Integer);
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v1}, Lcom/tencent/open/TaskGuide;->m(Lcom/tencent/open/TaskGuide;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/TaskGuide$i;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 388
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {v5, v5, v5}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 389
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v1, 0x41700000    # 15.0f
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 390
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v1, 0xf2
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v1, v7, v6}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v3, v3, v3, v1}, Landroid/widget/TextView;->setShadowLayer(FFFI)V
a=0;// 
a=0;//     .line 391
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 392
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/TextUtils$TruncateAt;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     .line 393
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V
a=0;// 
a=0;//     .line 396
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {v0, v4, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 397
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 398
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/open/TaskGuide;->d(Lcom/tencent/open/TaskGuide;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 399
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/tencent/open/TaskGuide$i;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 401
a=0;//     new-instance v0, Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/Button;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/open/TaskGuide;->n(Lcom/tencent/open/TaskGuide;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v4, v4, v4, v4}, Landroid/widget/Button;->setPadding(IIII)V
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     const/high16 v1, 0x41800000    # 16.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextSize(F)V
a=0;// 
a=0;//     .line 404
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {v5, v5, v5}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 405
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     const/16 v1, 0xf2
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v1, v7, v6}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v3, v3, v3, v1}, Landroid/widget/Button;->setShadowLayer(FFFI)V
a=0;// 
a=0;//     .line 406
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setIncludeFontPadding(Z)V
a=0;// 
a=0;//     .line 408
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/open/TaskGuide$f;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/open/TaskGuide$f;);
a=0;//     iget-object v2, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     iget-object v3, p0, Lcom/tencent/open/TaskGuide$i;->d:Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/open/TaskGuide$g;);
a=0;//     iget v3, v3, Lcom/tencent/open/TaskGuide$g;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v1, v2, v3}, Lcom/tencent/open/TaskGuide$f;-><init>(Lcom/tencent/open/TaskGuide;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide$f;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 409
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/open/TaskGuide;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/open/TaskGuide;->d(Lcom/tencent/open/TaskGuide;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {}, Lcom/tencent/open/TaskGuide;->b()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/open/TaskGuide;->d(Lcom/tencent/open/TaskGuide;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 410
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/open/TaskGuide;->d(Lcom/tencent/open/TaskGuide;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 411
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/open/TaskGuide;->d(Lcom/tencent/open/TaskGuide;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 412
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/tencent/open/TaskGuide$i;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 414
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/tencent/open/TaskGuide$k;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/16 v3, 0xff
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 417
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->d:Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide$g;);
a=0;//     iget-object v0, v0, Lcom/tencent/open/TaskGuide$g;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 418
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->b:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->d:Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide$g;);
a=0;//     iget-object v1, v1, Lcom/tencent/open/TaskGuide$g;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 421
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/open/TaskGuide$4;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1}, Lcom/tencent/open/TaskGuide$k;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 457
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 423
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 430
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->d:Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide$g;);
a=0;//     iget v0, v0, Lcom/tencent/open/TaskGuide$g;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v4, :cond_2
a=0;// 
a=0;//     .line 431
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->d:Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide$g;);
a=0;//     iget-object v1, v1, Lcom/tencent/open/TaskGuide$g;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 432
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 433
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     const/16 v1, 0xf6
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v3, v1, v2}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 434
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 435
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->d:Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide$g;);
a=0;//     iget v0, v0, Lcom/tencent/open/TaskGuide$g;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 436
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const-string v1, "\u9886\u53d6\u5956\u52b1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 437
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 438
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v1}, Lcom/tencent/open/TaskGuide;->o(Lcom/tencent/open/TaskGuide;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 439
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 444
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const-string v1, "\u9886\u53d6\u4e2d..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 445
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 448
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     const-string v1, "\u5df2\u9886\u53d6"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 449
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$i;->a:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/open/TaskGuide;->p(Lcom/tencent/open/TaskGuide;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 450
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$i;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 421
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
}}
