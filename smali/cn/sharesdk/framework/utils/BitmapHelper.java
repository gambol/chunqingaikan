package cn.sharesdk.framework.utils; class BitmapHelper { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/utils/BitmapHelper;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/utils/BitmapHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
a=0;//     .locals 34
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Landroid/graphics/Bitmap;);v3=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     mul-int v3, v5, v9
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v3, v3, [I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move v8, v5
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
a=0;// 
a=0;//     add-int/lit8 v21, v5, -0x1
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     add-int/lit8 v22, v9, -0x1
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     mul-int v4, v5, v9
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v6, p1, p1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v23, v6, 0x1
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     new-array v0, v4, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,[I);
a=0;//     new-array v0, v4, [I
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[I);
a=0;//     new-array v0, v4, [I
a=0;// 
a=0;//     move-object/from16 v26, v0
a=0;// 
a=0;//     #v26=(Reference,[I);
a=0;//     invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     new-array v0, v4, [I
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[I);
a=0;//     add-int/lit8 v4, v23, 0x1
a=0;// 
a=0;//     shr-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     mul-int v6, v4, v4
a=0;// 
a=0;//     mul-int/lit16 v4, v6, 0x100
a=0;// 
a=0;//     new-array v0, v4, [I
a=0;// 
a=0;//     move-object/from16 v28, v0
a=0;// 
a=0;//     #v28=(Reference,[I);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v7=(Integer);
a=0;//     mul-int/lit16 v7, v6, 0x100
a=0;// 
a=0;//     if-ge v4, v7, :cond_2
a=0;// 
a=0;//     div-int v7, v4, v6
a=0;// 
a=0;//     aput v7, v28, v4
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     filled-new-array {v0, v4}, [I
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v7, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, [[I
a=0;// 
a=0;//     add-int/lit8 v29, p1, 0x1
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move/from16 v19, v6
a=0;// 
a=0;//     #v19=(Null);
a=0;//     move v13, v6
a=0;// 
a=0;//     #v13=(Null);
a=0;//     move/from16 v20, v7
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v6=(Integer);v7=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Integer);v20=(Integer);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     if-ge v0, v9, :cond_7
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     neg-int v7, v0
a=0;// 
a=0;//     move v8, v6
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move v10, v6
a=0;// 
a=0;//     #v10=(Null);
a=0;//     move v11, v6
a=0;// 
a=0;//     #v11=(Null);
a=0;//     move v12, v6
a=0;// 
a=0;//     #v12=(Null);
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move v15, v6
a=0;// 
a=0;//     #v15=(Null);
a=0;//     move/from16 v16, v6
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v17, v6
a=0;// 
a=0;//     #v17=(Null);
a=0;//     move v7, v6
a=0;// 
a=0;//     :goto_4
a=0;//     #v6=(Integer);v8=(Integer);v10=(Integer);v11=(Integer);v12=(Integer);v15=(Integer);v16=(Integer);v17=(Integer);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     if-gt v14, v0, :cond_4
a=0;// 
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     add-int v18, v18, v13
a=0;// 
a=0;//     aget v18, v3, v18
a=0;// 
a=0;//     add-int v30, v14, p1
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     aget-object v30, v4, v30
a=0;// 
a=0;//     #v30=(Null);
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     const/high16 v32, 0xff0000
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     and-int v32, v32, v18
a=0;// 
a=0;//     shr-int/lit8 v32, v32, 0x10
a=0;// 
a=0;//     #v32=(Short);
a=0;//     aput v32, v30, v31
a=0;// 
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     #v31=(One);
a=0;//     const v32, 0xff00
a=0;// 
a=0;//     #v32=(Char);
a=0;//     and-int v32, v32, v18
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     shr-int/lit8 v32, v32, 0x8
a=0;// 
a=0;//     aput v32, v30, v31
a=0;// 
a=0;//     const/16 v31, 0x2
a=0;// 
a=0;//     #v31=(PosByte);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     aput v18, v30, v31
a=0;// 
a=0;//     invoke-static {v14}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     sub-int v18, v29, v18
a=0;// 
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     mul-int v31, v31, v18
a=0;// 
a=0;//     add-int v17, v17, v31
a=0;// 
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     #v31=(One);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     mul-int v31, v31, v18
a=0;// 
a=0;//     add-int v16, v16, v31
a=0;// 
a=0;//     const/16 v31, 0x2
a=0;// 
a=0;//     #v31=(PosByte);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     mul-int v18, v18, v31
a=0;// 
a=0;//     add-int v15, v15, v18
a=0;// 
a=0;//     if-lez v14, :cond_3
a=0;// 
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     aget v18, v30, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     add-int v8, v8, v18
a=0;// 
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     #v18=(One);
a=0;//     aget v18, v30, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     add-int v7, v7, v18
a=0;// 
a=0;//     const/16 v18, 0x2
a=0;// 
a=0;//     #v18=(PosByte);
a=0;//     aget v18, v30, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     add-int v6, v6, v18
a=0;// 
a=0;//     :goto_5
a=0;//     add-int/lit8 v14, v14, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_3
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     aget v18, v30, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     add-int v12, v12, v18
a=0;// 
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     #v18=(One);
a=0;//     aget v18, v30, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     add-int v11, v11, v18
a=0;// 
a=0;//     const/16 v18, 0x2
a=0;// 
a=0;//     #v18=(PosByte);
a=0;//     aget v18, v30, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     add-int v10, v10, v18
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v18=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move/from16 v18, v17
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     move/from16 v16, v15
a=0;// 
a=0;//     move v15, v14
a=0;// 
a=0;//     #v15=(Null);
a=0;//     move v14, v13
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move/from16 v13, p1
a=0;// 
a=0;//     :goto_6
a=0;//     #v15=(Integer);
a=0;//     if-ge v15, v5, :cond_6
a=0;// 
a=0;//     aget v30, v28, v18
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     aput v30, v24, v14
a=0;// 
a=0;//     aget v30, v28, v17
a=0;// 
a=0;//     aput v30, v25, v14
a=0;// 
a=0;//     aget v30, v28, v16
a=0;// 
a=0;//     aput v30, v26, v14
a=0;// 
a=0;//     sub-int v18, v18, v12
a=0;// 
a=0;//     sub-int v17, v17, v11
a=0;// 
a=0;//     sub-int v16, v16, v10
a=0;// 
a=0;//     sub-int v30, v13, p1
a=0;// 
a=0;//     add-int v30, v30, v23
a=0;// 
a=0;//     rem-int v30, v30, v23
a=0;// 
a=0;//     aget-object v30, v4, v30
a=0;// 
a=0;//     #v30=(Null);
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     sub-int v12, v12, v31
a=0;// 
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     #v31=(One);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     sub-int v11, v11, v31
a=0;// 
a=0;//     const/16 v31, 0x2
a=0;// 
a=0;//     #v31=(PosByte);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     sub-int v10, v10, v31
a=0;// 
a=0;//     if-nez v20, :cond_5
a=0;// 
a=0;//     add-int v31, v15, p1
a=0;// 
a=0;//     add-int/lit8 v31, v31, 0x1
a=0;// 
a=0;//     move/from16 v0, v31
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v31
a=0;// 
a=0;//     aput v31, v27, v15
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     aget v31, v27, v15
a=0;// 
a=0;//     add-int v31, v31, v19
a=0;// 
a=0;//     aget v31, v3, v31
a=0;// 
a=0;//     const/16 v32, 0x0
a=0;// 
a=0;//     #v32=(Null);
a=0;//     const/high16 v33, 0xff0000
a=0;// 
a=0;//     #v33=(Integer);
a=0;//     and-int v33, v33, v31
a=0;// 
a=0;//     shr-int/lit8 v33, v33, 0x10
a=0;// 
a=0;//     #v33=(Short);
a=0;//     aput v33, v30, v32
a=0;// 
a=0;//     const/16 v32, 0x1
a=0;// 
a=0;//     #v32=(One);
a=0;//     const v33, 0xff00
a=0;// 
a=0;//     #v33=(Char);
a=0;//     and-int v33, v33, v31
a=0;// 
a=0;//     #v33=(Integer);
a=0;//     shr-int/lit8 v33, v33, 0x8
a=0;// 
a=0;//     aput v33, v30, v32
a=0;// 
a=0;//     const/16 v32, 0x2
a=0;// 
a=0;//     #v32=(PosByte);
a=0;//     move/from16 v0, v31
a=0;// 
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     move/from16 v31, v0
a=0;// 
a=0;//     aput v31, v30, v32
a=0;// 
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     add-int v8, v8, v31
a=0;// 
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     #v31=(One);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     add-int v7, v7, v31
a=0;// 
a=0;//     const/16 v31, 0x2
a=0;// 
a=0;//     #v31=(PosByte);
a=0;//     aget v30, v30, v31
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     add-int v6, v6, v30
a=0;// 
a=0;//     add-int v18, v18, v8
a=0;// 
a=0;//     add-int v17, v17, v7
a=0;// 
a=0;//     add-int v16, v16, v6
a=0;// 
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     rem-int v13, v13, v23
a=0;// 
a=0;//     rem-int v30, v13, v23
a=0;// 
a=0;//     aget-object v30, v4, v30
a=0;// 
a=0;//     #v30=(Null);
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     add-int v12, v12, v31
a=0;// 
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     #v31=(One);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     add-int v11, v11, v31
a=0;// 
a=0;//     const/16 v31, 0x2
a=0;// 
a=0;//     #v31=(PosByte);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     add-int v10, v10, v31
a=0;// 
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     sub-int v8, v8, v31
a=0;// 
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     #v31=(One);
a=0;//     aget v31, v30, v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     sub-int v7, v7, v31
a=0;// 
a=0;//     const/16 v31, 0x2
a=0;// 
a=0;//     #v31=(PosByte);
a=0;//     aget v30, v30, v31
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     sub-int v6, v6, v30
a=0;// 
a=0;//     add-int/lit8 v14, v14, 0x1
a=0;// 
a=0;//     add-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_6
a=0;//     #v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);
a=0;//     add-int v6, v19, v5
a=0;// 
a=0;//     add-int/lit8 v7, v20, 0x1
a=0;// 
a=0;//     move/from16 v19, v6
a=0;// 
a=0;//     move v13, v14
a=0;// 
a=0;//     move/from16 v20, v7
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     :goto_7
a=0;//     #v15=(Integer);
a=0;//     if-ge v15, v5, :cond_d
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     neg-int v6, v0
a=0;// 
a=0;//     mul-int/2addr v6, v5
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     neg-int v8, v0
a=0;// 
a=0;//     move v10, v7
a=0;// 
a=0;//     #v10=(Null);
a=0;//     move v11, v7
a=0;// 
a=0;//     #v11=(Null);
a=0;//     move v12, v7
a=0;// 
a=0;//     #v12=(Null);
a=0;//     move v13, v7
a=0;// 
a=0;//     #v13=(Null);
a=0;//     move/from16 v18, v8
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move/from16 v16, v7
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v17, v7
a=0;// 
a=0;//     #v17=(Null);
a=0;//     move v8, v7
a=0;// 
a=0;//     :goto_8
a=0;//     #v7=(Integer);v10=(Integer);v11=(Integer);v12=(Integer);v13=(Integer);v14=(Integer);v16=(Integer);v17=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gt v0, v1, :cond_a
a=0;// 
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     add-int v20, v19, v15
a=0;// 
a=0;//     add-int v19, v18, p1
a=0;// 
a=0;//     aget-object v21, v4, v19
a=0;// 
a=0;//     #v21=(Null);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     aget v30, v24, v20
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     aput v30, v21, v19
a=0;// 
a=0;//     const/16 v19, 0x1
a=0;// 
a=0;//     #v19=(One);
a=0;//     aget v30, v25, v20
a=0;// 
a=0;//     aput v30, v21, v19
a=0;// 
a=0;//     const/16 v19, 0x2
a=0;// 
a=0;//     #v19=(PosByte);
a=0;//     aget v30, v26, v20
a=0;// 
a=0;//     aput v30, v21, v19
a=0;// 
a=0;//     invoke-static/range {v18 .. v18}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     sub-int v30, v29, v19
a=0;// 
a=0;//     aget v19, v24, v20
a=0;// 
a=0;//     mul-int v19, v19, v30
a=0;// 
a=0;//     add-int v19, v19, v17
a=0;// 
a=0;//     aget v17, v25, v20
a=0;// 
a=0;//     mul-int v17, v17, v30
a=0;// 
a=0;//     add-int v17, v17, v16
a=0;// 
a=0;//     aget v16, v26, v20
a=0;// 
a=0;//     mul-int v16, v16, v30
a=0;// 
a=0;//     add-int v16, v16, v14
a=0;// 
a=0;//     if-lez v18, :cond_9
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     aget v14, v21, v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-int/2addr v10, v14
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     aget v14, v21, v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-int/2addr v8, v14
a=0;// 
a=0;//     const/4 v14, 0x2
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     aget v14, v21, v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-int/2addr v7, v14
a=0;// 
a=0;//     :goto_9
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     if-ge v0, v1, :cond_8
a=0;// 
a=0;//     add-int/2addr v6, v5
a=0;// 
a=0;//     :cond_8
a=0;//     add-int/lit8 v14, v18, 0x1
a=0;// 
a=0;//     move/from16 v18, v14
a=0;// 
a=0;//     move/from16 v14, v16
a=0;// 
a=0;//     move/from16 v16, v17
a=0;// 
a=0;//     move/from16 v17, v19
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     aget v14, v21, v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-int/2addr v13, v14
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     aget v14, v21, v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-int/2addr v12, v14
a=0;// 
a=0;//     const/4 v14, 0x2
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     aget v14, v21, v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-int/2addr v11, v14
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);v21=(Integer);v30=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move/from16 v18, v16
a=0;// 
a=0;//     move/from16 v19, v17
a=0;// 
a=0;//     move/from16 v16, v6
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v17, v14
a=0;// 
a=0;//     move v14, v15
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v7, v8
a=0;// 
a=0;//     move v8, v10
a=0;// 
a=0;//     move v10, v11
a=0;// 
a=0;//     move v11, v12
a=0;// 
a=0;//     move v12, v13
a=0;// 
a=0;//     move/from16 v13, p1
a=0;// 
a=0;//     :goto_a
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-ge v0, v9, :cond_c
a=0;// 
a=0;//     const/high16 v20, -0x1000000
a=0;// 
a=0;//     aget v21, v3, v14
a=0;// 
a=0;//     and-int v20, v20, v21
a=0;// 
a=0;//     aget v21, v28, v19
a=0;// 
a=0;//     shl-int/lit8 v21, v21, 0x10
a=0;// 
a=0;//     or-int v20, v20, v21
a=0;// 
a=0;//     aget v21, v28, v18
a=0;// 
a=0;//     shl-int/lit8 v21, v21, 0x8
a=0;// 
a=0;//     or-int v20, v20, v21
a=0;// 
a=0;//     aget v21, v28, v17
a=0;// 
a=0;//     or-int v20, v20, v21
a=0;// 
a=0;//     aput v20, v3, v14
a=0;// 
a=0;//     sub-int v19, v19, v12
a=0;// 
a=0;//     sub-int v18, v18, v11
a=0;// 
a=0;//     sub-int v17, v17, v10
a=0;// 
a=0;//     sub-int v20, v13, p1
a=0;// 
a=0;//     add-int v20, v20, v23
a=0;// 
a=0;//     rem-int v20, v20, v23
a=0;// 
a=0;//     aget-object v20, v4, v20
a=0;// 
a=0;//     #v20=(Null);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     aget v21, v20, v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     sub-int v12, v12, v21
a=0;// 
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     aget v21, v20, v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     sub-int v11, v11, v21
a=0;// 
a=0;//     const/16 v21, 0x2
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     aget v21, v20, v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     sub-int v10, v10, v21
a=0;// 
a=0;//     if-nez v15, :cond_b
a=0;// 
a=0;//     add-int v21, v16, v29
a=0;// 
a=0;//     invoke-static/range {v21 .. v22}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     mul-int v21, v21, v5
a=0;// 
a=0;//     aput v21, v27, v16
a=0;// 
a=0;//     :cond_b
a=0;//     aget v21, v27, v16
a=0;// 
a=0;//     add-int v21, v21, v15
a=0;// 
a=0;//     const/16 v30, 0x0
a=0;// 
a=0;//     #v30=(Null);
a=0;//     aget v31, v24, v21
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     aput v31, v20, v30
a=0;// 
a=0;//     const/16 v30, 0x1
a=0;// 
a=0;//     #v30=(One);
a=0;//     aget v31, v25, v21
a=0;// 
a=0;//     aput v31, v20, v30
a=0;// 
a=0;//     const/16 v30, 0x2
a=0;// 
a=0;//     #v30=(PosByte);
a=0;//     aget v21, v26, v21
a=0;// 
a=0;//     aput v21, v20, v30
a=0;// 
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     aget v21, v20, v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     add-int v8, v8, v21
a=0;// 
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     aget v21, v20, v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     add-int v7, v7, v21
a=0;// 
a=0;//     const/16 v21, 0x2
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     aget v20, v20, v21
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     add-int v6, v6, v20
a=0;// 
a=0;//     add-int v19, v19, v8
a=0;// 
a=0;//     add-int v18, v18, v7
a=0;// 
a=0;//     add-int v17, v17, v6
a=0;// 
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     rem-int v13, v13, v23
a=0;// 
a=0;//     aget-object v20, v4, v13
a=0;// 
a=0;//     #v20=(Null);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     aget v21, v20, v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     add-int v12, v12, v21
a=0;// 
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     aget v21, v20, v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     add-int v11, v11, v21
a=0;// 
a=0;//     const/16 v21, 0x2
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     aget v21, v20, v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     add-int v10, v10, v21
a=0;// 
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     aget v21, v20, v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     sub-int v8, v8, v21
a=0;// 
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     aget v21, v20, v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     sub-int v7, v7, v21
a=0;// 
a=0;//     const/16 v21, 0x2
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     aget v20, v20, v21
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     sub-int v6, v6, v20
a=0;// 
a=0;//     add-int/2addr v14, v5
a=0;// 
a=0;//     add-int/lit8 v16, v16, 0x1
a=0;// 
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     :cond_c
a=0;//     #v21=(Integer);v30=(Conflicted);v31=(Conflicted);
a=0;//     add-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move v8, v5
a=0;// 
a=0;//     invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static blur(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
a=0;//     .locals 7
a=0;// 
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/high16 v4, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v2, p1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v3, p2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v2, v3
a=0;// 
a=0;//     add-float/2addr v2, v4
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v3, p2
a=0;// 
a=0;//     div-float/2addr v0, v3
a=0;// 
a=0;//     add-float/2addr v0, v4
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v3, p2
a=0;// 
a=0;//     div-float/2addr v1, v3
a=0;// 
a=0;//     add-float/2addr v1, v4
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v0, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v1, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Canvas;);
a=0;//     int-to-float v3, p2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float v3, v6, v3
a=0;// 
a=0;//     int-to-float v4, p2
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float v4, v6, v4
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->scale(FF)V
a=0;// 
a=0;//     new-instance v3, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setFlags(I)V
a=0;// 
a=0;//     invoke-virtual {v1, p0, v5, v5, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v2, v1}, Lcn/sharesdk/framework/utils/BitmapHelper;->a(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static captureView(Landroid/view/View;II)Landroid/graphics/Bitmap;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p0, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/h;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/network/h;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/h;);
a=0;//     const-string v1, "images"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, p0, p1, v1, v2}, Lcn/sharesdk/framework/network/h;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static fixRect([I[I)[I
a=0;//     .locals 7
a=0;// 
a=0;//     const/high16 v6, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     aget v1, p0, v4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     aget v2, p0, v5
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     aget v2, p1, v4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     aget v3, p1, v5
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v2, v3
a=0;// 
a=0;//     cmpl-float v1, v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     aget v1, p1, v4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aput v1, v0, v4
a=0;// 
a=0;//     aget v1, p0, v5
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     aget v2, p1, v4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     aget v2, p0, v4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     add-float/2addr v1, v6
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aput v1, v0, v5
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Byte);
a=0;//     aget v1, p1, v5
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aput v1, v0, v5
a=0;// 
a=0;//     aget v1, p0, v4
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     aget v2, p1, v5
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     aget v2, p0, v5
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     add-float/2addr v1, v6
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aput v1, v0, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getBitmap(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0, p1}, Lcn/sharesdk/framework/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/BitmapHelper;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getBitmap(Ljava/io/File;I)Landroid/graphics/Bitmap;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v0, p1}, Lcn/sharesdk/framework/utils/BitmapHelper;->getBitmap(Ljava/io/InputStream;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static getBitmap(Ljava/io/InputStream;I)Landroid/graphics/Bitmap;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-instance v0, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     iput-object v1, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z
a=0;// 
a=0;//     iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z
a=0;// 
a=0;//     iput p1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, v0}, Lcn/sharesdk/framework/utils/BitmapHelper;->getBitmap(Ljava/lang/String;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getBitmap(Ljava/lang/String;I)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0, p1}, Lcn/sharesdk/framework/utils/BitmapHelper;->getBitmap(Ljava/io/File;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static roundBitmap(Landroid/graphics/Bitmap;IIFFFF)Landroid/graphics/Bitmap;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v2, v6, v6, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     if-eq v1, p2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v1, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Canvas;);
a=0;//     const v3, -0xbdbdbe
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Paint;);
a=0;//     new-instance v5, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v5, v6, v6, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V
a=0;// 
a=0;//     invoke-virtual {v1, v6, v6, v6, v6}, Landroid/graphics/Canvas;->drawARGB(IIII)V
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [F
a=0;// 
a=0;//     #v3=(Reference,[F);
a=0;//     aput p3, v3, v6
a=0;// 
a=0;//     aput p3, v3, v8
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     aput p4, v3, v6
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     aput p4, v3, v6
a=0;// 
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     aput p5, v3, v6
a=0;// 
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     aput p5, v3, v6
a=0;// 
a=0;//     const/4 v6, 0x6
a=0;// 
a=0;//     aput p6, v3, v6
a=0;// 
a=0;//     const/4 v6, 0x7
a=0;// 
a=0;//     aput p6, v3, v6
a=0;// 
a=0;//     new-instance v6, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v6, v7, v7, v7, v7}, Landroid/graphics/RectF;-><init>(FFFF)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/RectF;);
a=0;//     new-instance v7, Landroid/graphics/drawable/shapes/RoundRectShape;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     invoke-direct {v7, v3, v6, v3}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     new-instance v3, Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-direct {v3, v7}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-virtual {v3, v5}, Landroid/graphics/drawable/ShapeDrawable;->setBounds(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/graphics/drawable/ShapeDrawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     new-instance v3, Landroid/graphics/PorterDuffXfermode;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/PorterDuffXfermode;);
a=0;//     sget-object v6, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;
a=0;// 
a=0;//     invoke-direct {v3, v6}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/PorterDuffXfermode;);
a=0;//     invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;
a=0;// 
a=0;//     invoke-virtual {v1, p0, v2, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(Null);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v0, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static saveViewToImage(Landroid/view/View;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0, v0, v1}, Lcn/sharesdk/framework/utils/BitmapHelper;->saveViewToImage(Landroid/view/View;II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static saveViewToImage(Landroid/view/View;II)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-static {p0, p1, p2}, Lcn/sharesdk/framework/utils/BitmapHelper;->captureView(Landroid/view/View;II)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "screenshot"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/R;->getCachePath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ".jpg"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v4, 0x64
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v3, v4, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
