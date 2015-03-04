package com.chinaMobile; class m { void a() { int a;
a=0;// .class public final Lcom/chinaMobile/m;
a=0;// .super Landroid/app/AlertDialog;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/widget/EditText;
a=0;// 
a=0;// .field b:Landroid/widget/Spinner;
a=0;// 
a=0;// .field c:Landroid/widget/Spinner;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v7, -0x2
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/chinaMobile/m;);
a=0;//     const-string v0, "\u53cd\u9988\u610f\u89c1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/chinaMobile/m;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     invoke-static {p1}, Lcom/chinaMobile/g;->g(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v1, v2, v2, v2, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     new-instance v2, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v2, v5, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     mul-int/lit16 v0, v0, 0xc8
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setMinimumWidth(I)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/EditText;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     iput-object v0, p0, Lcom/chinaMobile/m;->a:Landroid/widget/EditText;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/chinaMobile/m;->a:Landroid/widget/EditText;
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/EditText;->setMaxLines(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/chinaMobile/m;->a:Landroid/widget/EditText;
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/EditText;->setMinLines(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/chinaMobile/m;->a:Landroid/widget/EditText;
a=0;// 
a=0;//     const-string v2, "\u8bf7\u8f93\u5165\u60a8\u7684\u53cd\u9988\u610f\u89c1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/chinaMobile/m;->a:Landroid/widget/EditText;
a=0;// 
a=0;//     const/16 v2, 0x30
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/EditText;->setGravity(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iput v6, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     iget-object v2, p0, Lcom/chinaMobile/m;->a:Landroid/widget/EditText;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v2, Landroid/widget/Spinner;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/Spinner;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Spinner;);
a=0;//     iput-object v2, p0, Lcom/chinaMobile/m;->c:Landroid/widget/Spinner;
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v3, "\u6027\u522b"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v3, "\u7537"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v3, "\u5973"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v3, Lcom/chinaMobile/e;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/chinaMobile/e;);
a=0;//     invoke-direct {v3, p1, v2}, Lcom/chinaMobile/e;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/chinaMobile/e;);
a=0;//     iget-object v2, p0, Lcom/chinaMobile/m;->c:Landroid/widget/Spinner;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcom/chinaMobile/m;->c:Landroid/widget/Spinner;
a=0;// 
a=0;//     new-instance v3, Lcom/chinaMobile/n;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/chinaMobile/n;);
a=0;//     invoke-direct {v3}, Lcom/chinaMobile/n;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcom/chinaMobile/n;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v5, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v3, v5, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iput v6, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v4, "\u5e74\u9f84"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v4, "18\u5c81\u4ee5\u4e0b"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v4, "18-24\u5c81"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v4, "25-30\u5c81"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v4, "31-35\u5c81"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v4, "36-40\u5c81"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v4, "41-50\u5c81"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v4, "50-59\u5c81"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v4, "60\u5c81\u53ca\u4ee5\u4e0a"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v4, Landroid/widget/Spinner;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/Spinner;);
a=0;//     invoke-direct {v4, p1}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Spinner;);
a=0;//     iput-object v4, p0, Lcom/chinaMobile/m;->b:Landroid/widget/Spinner;
a=0;// 
a=0;//     new-instance v4, Lcom/chinaMobile/e;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/chinaMobile/e;);
a=0;//     invoke-direct {v4, p1, v3}, Lcom/chinaMobile/e;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/chinaMobile/e;);
a=0;//     iget-object v3, p0, Lcom/chinaMobile/m;->b:Landroid/widget/Spinner;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     iget-object v3, p0, Lcom/chinaMobile/m;->b:Landroid/widget/Spinner;
a=0;// 
a=0;//     new-instance v4, Lcom/chinaMobile/l;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/chinaMobile/l;);
a=0;//     invoke-direct {v4}, Lcom/chinaMobile/l;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcom/chinaMobile/l;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
a=0;// 
a=0;//     iget-object v3, p0, Lcom/chinaMobile/m;->c:Landroid/widget/Spinner;
a=0;// 
a=0;//     invoke-virtual {v0, v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v3, p0, Lcom/chinaMobile/m;->b:Landroid/widget/Spinner;
a=0;// 
a=0;//     invoke-virtual {v0, v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v5, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iput v6, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/chinaMobile/m;->setView(Landroid/view/View;)V
a=0;// 
a=0;//     const-string v0, "\u63d0\u4ea4"
a=0;// 
a=0;//     new-instance v1, Lcom/chinaMobile/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/chinaMobile/a;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/chinaMobile/a;-><init>(Lcom/chinaMobile/m;Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/chinaMobile/a;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/chinaMobile/m;->setButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     const-string v0, "\u53d6\u6d88"
a=0;// 
a=0;//     new-instance v1, Lcom/chinaMobile/c;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/chinaMobile/c;);
a=0;//     invoke-direct {v1, p0}, Lcom/chinaMobile/c;-><init>(Lcom/chinaMobile/m;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/chinaMobile/c;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/chinaMobile/m;->setButton2(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final setView(Landroid/view/View;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
