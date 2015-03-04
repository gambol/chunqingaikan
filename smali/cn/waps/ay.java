package cn.waps; class ay { void a() { int a;
a=0;// .class public Lcn/waps/ay;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Lcn/waps/ag;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:Ljava/util/List;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;Lcn/waps/ag;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/ay;);
a=0;//     iput-object p1, p0, Lcn/waps/ay;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ay;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "/Android/data/cache/funcCache"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "CacheTime"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/cs;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/ay;->b:Lcn/waps/ag;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/ay;->c:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Landroid/app/Dialog;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Landroid/widget/LinearLayout;
a=0;//     .locals 20
a=0;// 
a=0;//     new-instance v12, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v12, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v12=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v12, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     const/16 v4, 0x11
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v12, v4}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     new-instance v13, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v13=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v13, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/high16 v4, 0x41000000    # 8.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const-string v5, "#FF333333"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Lcn/waps/da;->b(FLjava/lang/String;)Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-virtual {v13, v4}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     new-instance v14, Landroid/widget/TextView;
a=0;// 
a=0;//     #v14=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v14, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v14=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v4, "\u4f7f\u7528\u4ee5\u4e0b\u5e94\u7528\u6253\u5f00"
a=0;// 
a=0;//     invoke-virtual {v14, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-virtual {v14, v4}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     new-instance v15, Landroid/widget/ListView;
a=0;// 
a=0;//     #v15=(UninitRef,Landroid/widget/ListView;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v15, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v15=(Reference,Landroid/widget/ListView;);
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v15, v4}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v4, Lcn/waps/be;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/waps/be;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v2, p3
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v3, p4
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v0, v1, v2, v3}, Lcn/waps/be;-><init>(Lcn/waps/ay;Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/be;);
a=0;//     invoke-virtual {v15, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-virtual {v15, v4}, Landroid/widget/ListView;->setBackgroundColor(I)V
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v15, v4}, Landroid/widget/ListView;->setCacheColorHint(I)V
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v15}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ListAdapter;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v4, v5, v6, v15}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v15}, Landroid/widget/ListView;->getDividerHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     const/16 v4, 0x4b
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v15}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     mul-int/2addr v4, v5
a=0;// 
a=0;//     iput v4, v6, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     invoke-virtual {v15, v6}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v16, Landroid/widget/ScrollView;
a=0;// 
a=0;//     #v16=(UninitRef,Landroid/widget/ScrollView;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ScrollView;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ScrollView;);v16=(Reference,Landroid/widget/ScrollView;);
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v17, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v17=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);v17=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     new-instance v18, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v18=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);v18=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v4, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/high16 v4, 0x41000000    # 8.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const-string v5, "#FF333333"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Lcn/waps/da;->c(FLjava/lang/String;)Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     new-instance v10, Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/widget/CheckBox;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v10, v0}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v10=(Reference,Landroid/widget/CheckBox;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v10, v4}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     new-instance v19, Landroid/widget/TextView;
a=0;// 
a=0;//     #v19=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);v19=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v4, "\u9ed8\u8ba4\u4f7f\u7528\u6b64\u5e94\u7528"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     new-instance v4, Lcn/waps/bb;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/waps/bb;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v4, v0, v10}, Lcn/waps/bb;-><init>(Lcn/waps/ay;Landroid/widget/CheckBox;)V
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/bb;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     new-instance v4, Lcn/waps/bc;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/waps/bc;);
a=0;//     move-object/from16 v5, p0
a=0;// 
a=0;//     move-object/from16 v6, p1
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v7, p3
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v8, p5
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v9, p6
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     move-object/from16 v11, p2
a=0;// 
a=0;//     #v11=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-direct/range {v4 .. v11}, Lcn/waps/bc;-><init>(Lcn/waps/ay;Landroid/content/Context;Ljava/util/List;Ljava/lang/String;ZLandroid/widget/CheckBox;Landroid/app/Dialog;)V
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/bc;);
a=0;//     invoke-virtual {v15, v4}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     invoke-static/range {p1 .. p1}, Lcn/waps/SDKUtils;->getDisplaySize(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0xf0
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-ne v4, v5, :cond_3
a=0;// 
a=0;//     const/high16 v4, 0x41700000    # 15.0f
a=0;// 
a=0;//     invoke-virtual {v14, v4}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/high16 v4, 0x41700000    # 15.0f
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v13, v4, v5, v6, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5, v6, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v4, v4, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_2
a=0;// 
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/16 v6, 0x46
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v6=(PosShort);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v17}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v12, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v12, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     return-object v12
a=0;// 
a=0;//     :catch_0
a=0;//     #v5=(Integer);v6=(Conflicted);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Integer);v5=(PosByte);v6=(Null);v7=(PosByte);v8=(Reference,Ljava/lang/String;);v9=(Boolean);v10=(Reference,Landroid/widget/CheckBox;);v11=(Reference,Landroid/app/Dialog;);v16=(Reference,Landroid/widget/ScrollView;);v17=(Reference,Landroid/widget/LinearLayout;);v18=(Reference,Landroid/widget/LinearLayout;);v19=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/16 v6, 0x69
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Integer);v5=(PosShort);v6=(Reference,Landroid/content/Context;);v7=(Reference,Ljava/util/List;);
a=0;//     const/16 v5, 0x140
a=0;// 
a=0;//     if-ne v4, v5, :cond_5
a=0;// 
a=0;//     const/16 v4, 0xe
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v5, 0xe
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/16 v7, 0xe
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v13, v4, v5, v6, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v4, 0xe
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5, v6, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v4, v4, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_4
a=0;// 
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/16 v6, 0x96
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Integer);v5=(PosByte);v6=(Null);
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/16 v6, 0xe1
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v4=(Integer);v5=(PosShort);v6=(Reference,Landroid/content/Context;);v7=(Reference,Ljava/util/List;);
a=0;//     const/16 v5, 0x2d0
a=0;// 
a=0;//     if-ne v4, v5, :cond_7
a=0;// 
a=0;//     const/high16 v4, 0x41880000    # 17.0f
a=0;// 
a=0;//     invoke-virtual {v14, v4}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/high16 v4, 0x41880000    # 17.0f
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/16 v4, 0x1c
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v5, 0x1c
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/16 v7, 0x1c
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v13, v4, v5, v6, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v4, 0x1c
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     const/16 v7, 0xd
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5, v6, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v4, v4, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_6
a=0;// 
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/16 v6, 0x12c
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v4=(Integer);v5=(PosByte);v6=(Null);
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/16 v6, 0x177
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v4=(Integer);v5=(PosShort);v6=(Reference,Landroid/content/Context;);v7=(Reference,Ljava/util/List;);
a=0;//     const/16 v5, 0x438
a=0;// 
a=0;//     if-ne v4, v5, :cond_9
a=0;// 
a=0;//     const/high16 v4, 0x41a00000    # 20.0f
a=0;// 
a=0;//     invoke-virtual {v14, v4}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/high16 v4, 0x41a00000    # 20.0f
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/16 v4, 0x14
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v5, 0x14
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/16 v7, 0x14
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v13, v4, v5, v6, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v4, 0x14
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5, v6, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v4, v4, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_8
a=0;// 
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/16 v6, 0x1e0
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v4=(Integer);v5=(PosByte);v6=(Null);
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/16 v6, 0x258
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     #v4=(Integer);v5=(PosShort);v6=(Reference,Landroid/content/Context;);v7=(Reference,Ljava/util/List;);
a=0;//     const/high16 v4, 0x41800000    # 16.0f
a=0;// 
a=0;//     invoke-virtual {v14, v4}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/high16 v4, 0x41800000    # 16.0f
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/16 v4, 0x14
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v5, 0x14
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/16 v7, 0x14
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v13, v4, v5, v6, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v4, 0x14
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5, v6, v7}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v4, v4, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_a
a=0;// 
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/16 v6, 0xe1
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v4=(Integer);v5=(PosByte);v6=(Null);
a=0;//     invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     new-instance v4, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/16 v6, 0x12c
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/waps/ay;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ay;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/waps/ay;Ljava/util/List;)Ljava/util/List;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/ay;->d:Ljava/util/List;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "AppSettings"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "pref_packageName"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "pref_className"
a=0;// 
a=0;//     invoke-interface {v0, v1, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "pref_uriStr"
a=0;// 
a=0;//     invoke-interface {v0, v1, p4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Z)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v8=(One);
a=0;//     invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/waps/AdInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdPackage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->k()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->l()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v6, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/waps/cs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/cs;);
a=0;//     invoke-direct {v0, p1}, Lcn/waps/cs;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cs;);
a=0;//     invoke-virtual {v0, p1, v2, v4, p4}, Lcn/waps/cs;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Landroid/content/Intent;);v7=(Uninit);
a=0;//     invoke-direct {p0, p1, v2, v4, p4}, Lcn/waps/ay;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v8, :cond_1
a=0;// 
a=0;//     new-instance v6, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v6, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v2, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     const-string v0, "\u5b89\u88c5"
a=0;// 
a=0;//     new-instance v2, Lcn/waps/az;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/waps/az;);
a=0;//     invoke-direct {v2, p0, p1, v5, v1}, Lcn/waps/az;-><init>(Lcn/waps/ay;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/az;);
a=0;//     invoke-virtual {v6, v0, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     const-string v7, "\u53d6\u6d88"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcn/waps/ba;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/ba;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     move v2, p5
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     move-object v5, p1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/waps/ba;-><init>(Lcn/waps/ay;ZLjava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ba;);
a=0;//     invoke-virtual {v6, v7, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/waps/ay;->b()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const-string v0, "\u542f\u52a8\u7a0b\u5e8f\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"
a=0;// 
a=0;//     invoke-static {p1, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v0, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "2"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/waps/AdInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v0, "video/*"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :goto_1
a=0;//     const/high16 v0, 0x10000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     const-string v0, "AppSettings"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "pref_fun_error"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v8}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v2=(Integer);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Landroid/content/Intent;);v7=(Uninit);
a=0;//     new-instance v0, Lcn/waps/at;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/at;);
a=0;//     invoke-direct {v0}, Lcn/waps/at;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/at;);
a=0;//     invoke-virtual {v0, p1, v5, v1}, Lcn/waps/at;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Z)V
a=0;//     .locals 10
a=0;// 
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     invoke-direct {v0, p1}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v0}, Lcn/waps/SDKUtils;->getInstalled()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/waps/AdInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdPackage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v2, v0, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);v3=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v2=(Reference,Ljava/util/ArrayList;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference,Ljava/lang/String;);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ay;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move v5, p4
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/waps/ay;->a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Z)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(One);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "AppSettings"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "pref_fun_cache_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v0, v1, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long v3, v5, v3
a=0;// 
a=0;//     const-wide/32 v5, 0xf731400
a=0;// 
a=0;//     cmp-long v1, v3, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_4
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v3, "pref_fun_default_packageName"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     const-string v3, "pref_fun_default_packageName"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v1, "pref_fun_error"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v3, "pref_fun_error"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v3, "pref_fun_cache_time"
a=0;// 
a=0;//     invoke-interface {v1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v3, "pref_fun_default_packageName"
a=0;// 
a=0;//     invoke-interface {v1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     const-string v1, "pref_fun_default_packageName"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v4}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     invoke-virtual {v7, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v3, v0, :cond_9
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/waps/AdInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdPackage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v3, v0, :cond_7
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ay;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     move v5, p4
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/waps/ay;->a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Z)V
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v5, Landroid/app/Dialog;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/app/Dialog;);
a=0;//     invoke-direct {v5, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Dialog;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v5, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     move-object v3, p0
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/ay;);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     move-object v6, v2
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v8, p3
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move v9, p4
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     invoke-direct/range {v3 .. v9}, Lcn/waps/ay;->a(Landroid/content/Context;Landroid/app/Dialog;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v5, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v5, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/app/Dialog;->show()V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/waps/ay;->b()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Byte);v3=(Integer);v5=(LongLo);v6=(Null);v8=(Uninit);v9=(Uninit);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Integer);v1=(Byte);v3=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/waps/ay;Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct/range {p0 .. p5}, Lcn/waps/ay;->a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/waps/ay;)Lcn/waps/ag;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ay;->b:Lcn/waps/ag;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ag;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Ljava/io/InputStream;)Ljava/util/List;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lorg/xmlpull/v1/XmlPullParser;);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Reference,Lcn/waps/AdInfo;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     if-eq v3, v5, :cond_d
a=0;// 
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :pswitch_0
a=0;//     #v5=(Conflicted);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/AdInfo;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v9, v0
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     move v3, v9
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     :try_start_2
a=0;//     #v5=(One);v9=(Conflicted);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     move-object v1, v9
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v3=(Integer);v9=(Conflicted);
a=0;//     const-string v3, "Ad"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     new-instance v1, Lcn/waps/AdInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/AdInfo;);
a=0;//     invoke-direct {v1}, Lcn/waps/AdInfo;-><init>()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcn/waps/AdInfo;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v3, "AdId"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "Title"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->h(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "Image"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "AppType"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->t(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "Filesize"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->k(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "Version"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->j(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "Content"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_8
a=0;//     #v3=(Conflicted);
a=0;//     sget-object v3, Lcn/waps/AppConnect;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->f(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_9
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "DownUrl"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->m(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_a
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "ActivityName"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_b
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->r(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_b
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "Params"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->s(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v3, v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v3=(Integer);v5=(One);
a=0;//     const-string v3, "Ad"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/waps/AdInfo;->getAdId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     const-string v3, "/Android/data/cache/funcCache"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcn/waps/AdInfo;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_c
a=0;// 
a=0;//     iget-object v6, p0, Lcn/waps/ay;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v6}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcn/waps/ay;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Lcn/waps/AdInfo;->getAdId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7, v5, v8, v3}, Lcn/waps/AppConnect;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcn/waps/AdInfo;->a(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     :cond_c
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v3=(Uninit);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_d
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_1
a=0;//     #v3=(Reference,Lcn/waps/AdInfo;);v4=(Reference,Lorg/xmlpull/v1/XmlPullParser;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v9, v0
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v9
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected a()V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/waps/bd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/bd;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcn/waps/bd;-><init>(Lcn/waps/ay;Lcn/waps/az;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bd;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/bd;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcn/waps/ay;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ay;->d:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lcn/waps/bd;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/bd;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcn/waps/bd;-><init>(Lcn/waps/ay;Lcn/waps/az;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bd;);
a=0;//     new-array v1, v2, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/bd;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/ay;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ay;->d:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_6
a=0;// 
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/ay;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ay;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/waps/AdInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->l()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     invoke-direct {p0, p1, v4, p3, p4}, Lcn/waps/ay;->a(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Z)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v4=(Conflicted);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "2"
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     const-string v1, "video/*"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Integer);v2=(Null);v4=(Reference,Ljava/util/ArrayList;);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Reference,Landroid/content/Intent;);v1=(Boolean);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected b()V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/waps/bf;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/bf;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcn/waps/bf;-><init>(Lcn/waps/ay;Lcn/waps/az;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bf;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/bf;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
