package com.twocloo.com.cn.utils; class FastBlur { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/FastBlur;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FastBlur.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/FastBlur;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static doBlur(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
a=0;//     .locals 42
a=0;//     .param p0, "sentBitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "radius"    # I
a=0;//     .param p2, "canReuseInBitmap"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 47
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     .line 52
a=0;//     .local v2, "bitmap":Landroid/graphics/Bitmap;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Landroid/graphics/Bitmap;);v4=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     .line 53
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 247
a=0;//     .end local v2    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);v34=(Conflicted);v35=(Conflicted);v36=(Conflicted);v37=(Conflicted);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Uninit);v38=(Uninit);v39=(Uninit);v40=(Uninit);v41=(Uninit);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .restart local v2    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :cond_1
a=0;//     #v0=(Integer);v4=(One);v6=(Conflicted);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 57
a=0;//     .local v5, "w":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 59
a=0;//     .local v9, "h":I
a=0;//     #v9=(Integer);
a=0;//     mul-int v4, v5, v9
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     new-array v3, v4, [I
a=0;// 
a=0;//     .line 60
a=0;//     .local v3, "pix":[I
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
a=0;//     .line 62
a=0;//     add-int/lit8 v36, v5, -0x1
a=0;// 
a=0;//     .line 63
a=0;//     .local v36, "wm":I
a=0;//     #v36=(Integer);
a=0;//     add-int/lit8 v21, v9, -0x1
a=0;// 
a=0;//     .line 64
a=0;//     .local v21, "hm":I
a=0;//     #v21=(Integer);
a=0;//     mul-int v35, v5, v9
a=0;// 
a=0;//     .line 65
a=0;//     .local v35, "wh":I
a=0;//     #v35=(Integer);
a=0;//     add-int v4, p1, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v14, v4, 0x1
a=0;// 
a=0;//     .line 67
a=0;//     .local v14, "div":I
a=0;//     #v14=(Integer);
a=0;//     move/from16 v0, v35
a=0;// 
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     .line 68
a=0;//     .local v24, "r":[I
a=0;//     #v24=(Reference,[I);
a=0;//     move/from16 v0, v35
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     .line 69
a=0;//     .local v17, "g":[I
a=0;//     #v17=(Reference,[I);
a=0;//     move/from16 v0, v35
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v10, v0, [I
a=0;// 
a=0;//     .line 71
a=0;//     .local v10, "b":[I
a=0;//     #v10=(Reference,[I);
a=0;//     invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     new-array v0, v4, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v34, v0
a=0;// 
a=0;//     .line 73
a=0;//     .local v34, "vmin":[I
a=0;//     #v34=(Reference,[I);
a=0;//     add-int/lit8 v4, v14, 0x1
a=0;// 
a=0;//     shr-int/lit8 v15, v4, 0x1
a=0;// 
a=0;//     .line 74
a=0;//     .local v15, "divsum":I
a=0;//     #v15=(Integer);
a=0;//     mul-int/2addr v15, v15
a=0;// 
a=0;//     .line 75
a=0;//     mul-int/lit16 v4, v15, 0x100
a=0;// 
a=0;//     new-array v0, v4, [I
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     .line 76
a=0;//     .local v16, "dv":[I
a=0;//     #v16=(Reference,[I);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     .local v22, "i":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v22=(Integer);
a=0;//     mul-int/lit16 v4, v15, 0x100
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_2
a=0;// 
a=0;//     .line 80
a=0;//     const/16 v39, 0x0
a=0;// 
a=0;//     .local v39, "yi":I
a=0;//     #v39=(Null);
a=0;//     move/from16 v41, v39
a=0;// 
a=0;//     .line 82
a=0;//     .local v41, "yw":I
a=0;//     #v41=(Null);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     filled-new-array {v14, v4}, [I
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v6, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     #v31=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v31, [[I
a=0;// 
a=0;//     .line 87
a=0;//     .local v31, "stack":[[I
a=0;//     add-int/lit8 v25, p1, 0x1
a=0;// 
a=0;//     .line 91
a=0;//     .local v25, "r1":I
a=0;//     #v25=(Integer);
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     .local v38, "y":I
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v23=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v32=(Conflicted);v33=(Conflicted);v37=(Conflicted);v38=(Integer);v39=(Integer);v41=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     if-lt v0, v9, :cond_3
a=0;// 
a=0;//     .line 164
a=0;//     const/16 v37, 0x0
a=0;// 
a=0;//     .local v37, "x":I
a=0;//     :goto_4
a=0;//     #v37=(Integer);v40=(Conflicted);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     if-lt v0, v5, :cond_8
a=0;// 
a=0;//     .line 245
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     move v8, v5
a=0;// 
a=0;//     invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 77
a=0;//     .end local v25    # "r1":I
a=0;//     .end local v31    # "stack":[[I
a=0;//     .end local v37    # "x":I
a=0;//     .end local v38    # "y":I
a=0;//     .end local v39    # "yi":I
a=0;//     .end local v41    # "yw":I
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v4=(Integer);v11=(Uninit);v12=(Uninit);v13=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v23=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v37=(Uninit);v38=(Uninit);v39=(Uninit);v40=(Uninit);v41=(Uninit);
a=0;//     div-int v4, v22, v15
a=0;// 
a=0;//     aput v4, v16, v22
a=0;// 
a=0;//     .line 76
a=0;//     add-int/lit8 v22, v22, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 92
a=0;//     .restart local v25    # "r1":I
a=0;//     .restart local v31    # "stack":[[I
a=0;//     .restart local v38    # "y":I
a=0;//     .restart local v39    # "yi":I
a=0;//     .restart local v41    # "yw":I
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v23=(Conflicted);v25=(Integer);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Reference,[[I);v32=(Conflicted);v33=(Conflicted);v37=(Conflicted);v38=(Integer);v39=(Integer);v41=(Integer);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .local v13, "bsum":I
a=0;//     #v13=(Null);
a=0;//     move/from16 v20, v13
a=0;// 
a=0;//     .local v20, "gsum":I
a=0;//     #v20=(Null);
a=0;//     move/from16 v29, v13
a=0;// 
a=0;//     .local v29, "rsum":I
a=0;//     #v29=(Null);
a=0;//     move v12, v13
a=0;// 
a=0;//     .local v12, "boutsum":I
a=0;//     #v12=(Null);
a=0;//     move/from16 v19, v13
a=0;// 
a=0;//     .local v19, "goutsum":I
a=0;//     #v19=(Null);
a=0;//     move/from16 v28, v13
a=0;// 
a=0;//     .local v28, "routsum":I
a=0;//     #v28=(Null);
a=0;//     move v11, v13
a=0;// 
a=0;//     .local v11, "binsum":I
a=0;//     #v11=(Null);
a=0;//     move/from16 v18, v13
a=0;// 
a=0;//     .local v18, "ginsum":I
a=0;//     #v18=(Null);
a=0;//     move/from16 v27, v13
a=0;// 
a=0;//     .line 93
a=0;//     .local v27, "rinsum":I
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     :goto_5
a=0;//     #v11=(Integer);v12=(Integer);v13=(Integer);v18=(Integer);v19=(Integer);v20=(Integer);v27=(Integer);v28=(Integer);v29=(Integer);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_4
a=0;// 
a=0;//     .line 113
a=0;//     move/from16 v32, p1
a=0;// 
a=0;//     .line 115
a=0;//     .local v32, "stackpointer":I
a=0;//     #v32=(Integer);
a=0;//     const/16 v37, 0x0
a=0;// 
a=0;//     .restart local v37    # "x":I
a=0;//     :goto_6
a=0;//     #v37=(Integer);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     if-lt v0, v5, :cond_6
a=0;// 
a=0;//     .line 162
a=0;//     add-int v41, v41, v5
a=0;// 
a=0;//     .line 91
a=0;//     add-int/lit8 v38, v38, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 94
a=0;//     .end local v32    # "stackpointer":I
a=0;//     .end local v37    # "x":I
a=0;//     :cond_4
a=0;//     #v32=(Conflicted);v37=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move/from16 v0, v36
a=0;// 
a=0;//     invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int v4, v4, v39
a=0;// 
a=0;//     aget v23, v3, v4
a=0;// 
a=0;//     .line 95
a=0;//     .local v23, "p":I
a=0;//     #v23=(Integer);
a=0;//     add-int v4, v22, p1
a=0;// 
a=0;//     aget-object v30, v31, v4
a=0;// 
a=0;//     .line 96
a=0;//     .local v30, "sir":[I
a=0;//     #v30=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/high16 v6, 0xff0000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     and-int v6, v6, v23
a=0;// 
a=0;//     shr-int/lit8 v6, v6, 0x10
a=0;// 
a=0;//     #v6=(Short);
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 97
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const v6, 0xff00
a=0;// 
a=0;//     #v6=(Char);
a=0;//     and-int v6, v6, v23
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     shr-int/lit8 v6, v6, 0x8
a=0;// 
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 98
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     and-int/lit16 v6, v0, 0xff
a=0;// 
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 99
a=0;//     invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v26, v25, v4
a=0;// 
a=0;//     .line 100
a=0;//     .local v26, "rbs":I
a=0;//     #v26=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-int v4, v4, v26
a=0;// 
a=0;//     add-int v29, v29, v4
a=0;// 
a=0;//     .line 101
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-int v4, v4, v26
a=0;// 
a=0;//     add-int v20, v20, v4
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-int v4, v4, v26
a=0;// 
a=0;//     add-int/2addr v13, v4
a=0;// 
a=0;//     .line 103
a=0;//     if-lez v22, :cond_5
a=0;// 
a=0;//     .line 104
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v27, v27, v4
a=0;// 
a=0;//     .line 105
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v18, v18, v4
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v11, v4
a=0;// 
a=0;//     .line 93
a=0;//     :goto_7
a=0;//     add-int/lit8 v22, v22, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 108
a=0;//     :cond_5
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v28, v28, v4
a=0;// 
a=0;//     .line 109
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v19, v19, v4
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v12, v4
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 117
a=0;//     .end local v23    # "p":I
a=0;//     .end local v26    # "rbs":I
a=0;//     .end local v30    # "sir":[I
a=0;//     .restart local v32    # "stackpointer":I
a=0;//     .restart local v37    # "x":I
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);v6=(Conflicted);v23=(Conflicted);v26=(Conflicted);v30=(Conflicted);v32=(Integer);v37=(Integer);
a=0;//     aget v4, v16, v29
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aput v4, v24, v39
a=0;// 
a=0;//     .line 118
a=0;//     aget v4, v16, v20
a=0;// 
a=0;//     aput v4, v17, v39
a=0;// 
a=0;//     .line 119
a=0;//     aget v4, v16, v13
a=0;// 
a=0;//     aput v4, v10, v39
a=0;// 
a=0;//     .line 121
a=0;//     sub-int v29, v29, v28
a=0;// 
a=0;//     .line 122
a=0;//     sub-int v20, v20, v19
a=0;// 
a=0;//     .line 123
a=0;//     sub-int/2addr v13, v12
a=0;// 
a=0;//     .line 125
a=0;//     sub-int v4, v32, p1
a=0;// 
a=0;//     add-int v33, v4, v14
a=0;// 
a=0;//     .line 126
a=0;//     .local v33, "stackstart":I
a=0;//     #v33=(Integer);
a=0;//     rem-int v4, v33, v14
a=0;// 
a=0;//     aget-object v30, v31, v4
a=0;// 
a=0;//     .line 128
a=0;//     .restart local v30    # "sir":[I
a=0;//     #v30=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v28, v28, v4
a=0;// 
a=0;//     .line 129
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v19, v19, v4
a=0;// 
a=0;//     .line 130
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v12, v4
a=0;// 
a=0;//     .line 132
a=0;//     if-nez v38, :cond_7
a=0;// 
a=0;//     .line 133
a=0;//     add-int v4, v37, p1
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     move/from16 v0, v36
a=0;// 
a=0;//     invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     aput v4, v34, v37
a=0;// 
a=0;//     .line 135
a=0;//     :cond_7
a=0;//     aget v4, v34, v37
a=0;// 
a=0;//     add-int v4, v4, v41
a=0;// 
a=0;//     aget v23, v3, v4
a=0;// 
a=0;//     .line 137
a=0;//     .restart local v23    # "p":I
a=0;//     #v23=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/high16 v6, 0xff0000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     and-int v6, v6, v23
a=0;// 
a=0;//     shr-int/lit8 v6, v6, 0x10
a=0;// 
a=0;//     #v6=(Short);
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 138
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const v6, 0xff00
a=0;// 
a=0;//     #v6=(Char);
a=0;//     and-int v6, v6, v23
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     shr-int/lit8 v6, v6, 0x8
a=0;// 
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 139
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     and-int/lit16 v6, v0, 0xff
a=0;// 
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v27, v27, v4
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v18, v18, v4
a=0;// 
a=0;//     .line 143
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v11, v4
a=0;// 
a=0;//     .line 145
a=0;//     add-int v29, v29, v27
a=0;// 
a=0;//     .line 146
a=0;//     add-int v20, v20, v18
a=0;// 
a=0;//     .line 147
a=0;//     add-int/2addr v13, v11
a=0;// 
a=0;//     .line 149
a=0;//     add-int/lit8 v4, v32, 0x1
a=0;// 
a=0;//     rem-int v32, v4, v14
a=0;// 
a=0;//     .line 150
a=0;//     rem-int v4, v32, v14
a=0;// 
a=0;//     aget-object v30, v31, v4
a=0;// 
a=0;//     .line 152
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v28, v28, v4
a=0;// 
a=0;//     .line 153
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v19, v19, v4
a=0;// 
a=0;//     .line 154
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v12, v4
a=0;// 
a=0;//     .line 156
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v27, v27, v4
a=0;// 
a=0;//     .line 157
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v18, v18, v4
a=0;// 
a=0;//     .line 158
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v11, v4
a=0;// 
a=0;//     .line 160
a=0;//     add-int/lit8 v39, v39, 0x1
a=0;// 
a=0;//     .line 115
a=0;//     add-int/lit8 v37, v37, 0x1
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 165
a=0;//     .end local v11    # "binsum":I
a=0;//     .end local v12    # "boutsum":I
a=0;//     .end local v13    # "bsum":I
a=0;//     .end local v18    # "ginsum":I
a=0;//     .end local v19    # "goutsum":I
a=0;//     .end local v20    # "gsum":I
a=0;//     .end local v23    # "p":I
a=0;//     .end local v27    # "rinsum":I
a=0;//     .end local v28    # "routsum":I
a=0;//     .end local v29    # "rsum":I
a=0;//     .end local v30    # "sir":[I
a=0;//     .end local v32    # "stackpointer":I
a=0;//     .end local v33    # "stackstart":I
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v23=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v32=(Conflicted);v33=(Conflicted);v40=(Conflicted);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .restart local v13    # "bsum":I
a=0;//     #v13=(Null);
a=0;//     move/from16 v20, v13
a=0;// 
a=0;//     .restart local v20    # "gsum":I
a=0;//     #v20=(Null);
a=0;//     move/from16 v29, v13
a=0;// 
a=0;//     .restart local v29    # "rsum":I
a=0;//     #v29=(Null);
a=0;//     move v12, v13
a=0;// 
a=0;//     .restart local v12    # "boutsum":I
a=0;//     #v12=(Null);
a=0;//     move/from16 v19, v13
a=0;// 
a=0;//     .restart local v19    # "goutsum":I
a=0;//     #v19=(Null);
a=0;//     move/from16 v28, v13
a=0;// 
a=0;//     .restart local v28    # "routsum":I
a=0;//     #v28=(Null);
a=0;//     move v11, v13
a=0;// 
a=0;//     .restart local v11    # "binsum":I
a=0;//     #v11=(Null);
a=0;//     move/from16 v18, v13
a=0;// 
a=0;//     .restart local v18    # "ginsum":I
a=0;//     #v18=(Null);
a=0;//     move/from16 v27, v13
a=0;// 
a=0;//     .line 166
a=0;//     .restart local v27    # "rinsum":I
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     neg-int v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-int v40, v4, v5
a=0;// 
a=0;//     .line 167
a=0;//     .local v40, "yp":I
a=0;//     #v40=(Integer);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     :goto_8
a=0;//     #v11=(Integer);v12=(Integer);v13=(Integer);v18=(Integer);v19=(Integer);v20=(Integer);v27=(Integer);v28=(Integer);v29=(Integer);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_9
a=0;// 
a=0;//     .line 196
a=0;//     move/from16 v39, v37
a=0;// 
a=0;//     .line 197
a=0;//     move/from16 v32, p1
a=0;// 
a=0;//     .line 198
a=0;//     .restart local v32    # "stackpointer":I
a=0;//     #v32=(Integer);
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     :goto_9
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     if-lt v0, v9, :cond_c
a=0;// 
a=0;//     .line 164
a=0;//     add-int/lit8 v37, v37, 0x1
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 168
a=0;//     .end local v32    # "stackpointer":I
a=0;//     :cond_9
a=0;//     #v32=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v39, v4, v37
a=0;// 
a=0;//     .line 170
a=0;//     add-int v4, v22, p1
a=0;// 
a=0;//     aget-object v30, v31, v4
a=0;// 
a=0;//     .line 172
a=0;//     .restart local v30    # "sir":[I
a=0;//     #v30=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v6, v24, v39
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 173
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v6, v17, v39
a=0;// 
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 174
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v6, v10, v39
a=0;// 
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 176
a=0;//     invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v26, v25, v4
a=0;// 
a=0;//     .line 178
a=0;//     .restart local v26    # "rbs":I
a=0;//     #v26=(Integer);
a=0;//     aget v4, v24, v39
a=0;// 
a=0;//     mul-int v4, v4, v26
a=0;// 
a=0;//     add-int v29, v29, v4
a=0;// 
a=0;//     .line 179
a=0;//     aget v4, v17, v39
a=0;// 
a=0;//     mul-int v4, v4, v26
a=0;// 
a=0;//     add-int v20, v20, v4
a=0;// 
a=0;//     .line 180
a=0;//     aget v4, v10, v39
a=0;// 
a=0;//     mul-int v4, v4, v26
a=0;// 
a=0;//     add-int/2addr v13, v4
a=0;// 
a=0;//     .line 182
a=0;//     if-lez v22, :cond_b
a=0;// 
a=0;//     .line 183
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v27, v27, v4
a=0;// 
a=0;//     .line 184
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v18, v18, v4
a=0;// 
a=0;//     .line 185
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v11, v4
a=0;// 
a=0;//     .line 192
a=0;//     :goto_a
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     if-ge v0, v1, :cond_a
a=0;// 
a=0;//     .line 193
a=0;//     add-int v40, v40, v5
a=0;// 
a=0;//     .line 167
a=0;//     :cond_a
a=0;//     add-int/lit8 v22, v22, 0x1
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 187
a=0;//     :cond_b
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v28, v28, v4
a=0;// 
a=0;//     .line 188
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v19, v19, v4
a=0;// 
a=0;//     .line 189
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v12, v4
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 200
a=0;//     .end local v26    # "rbs":I
a=0;//     .end local v30    # "sir":[I
a=0;//     .restart local v32    # "stackpointer":I
a=0;//     :cond_c
a=0;//     #v6=(Conflicted);v26=(Conflicted);v30=(Conflicted);v32=(Integer);
a=0;//     const/high16 v4, -0x1000000
a=0;// 
a=0;//     aget v6, v3, v39
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     and-int/2addr v4, v6
a=0;// 
a=0;//     aget v6, v16, v29
a=0;// 
a=0;//     shl-int/lit8 v6, v6, 0x10
a=0;// 
a=0;//     or-int/2addr v4, v6
a=0;// 
a=0;//     aget v6, v16, v20
a=0;// 
a=0;//     shl-int/lit8 v6, v6, 0x8
a=0;// 
a=0;//     or-int/2addr v4, v6
a=0;// 
a=0;//     aget v6, v16, v13
a=0;// 
a=0;//     or-int/2addr v4, v6
a=0;// 
a=0;//     aput v4, v3, v39
a=0;// 
a=0;//     .line 202
a=0;//     sub-int v29, v29, v28
a=0;// 
a=0;//     .line 203
a=0;//     sub-int v20, v20, v19
a=0;// 
a=0;//     .line 204
a=0;//     sub-int/2addr v13, v12
a=0;// 
a=0;//     .line 206
a=0;//     sub-int v4, v32, p1
a=0;// 
a=0;//     add-int v33, v4, v14
a=0;// 
a=0;//     .line 207
a=0;//     .restart local v33    # "stackstart":I
a=0;//     #v33=(Integer);
a=0;//     rem-int v4, v33, v14
a=0;// 
a=0;//     aget-object v30, v31, v4
a=0;// 
a=0;//     .line 209
a=0;//     .restart local v30    # "sir":[I
a=0;//     #v30=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v28, v28, v4
a=0;// 
a=0;//     .line 210
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v19, v19, v4
a=0;// 
a=0;//     .line 211
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v12, v4
a=0;// 
a=0;//     .line 213
a=0;//     if-nez v37, :cond_d
a=0;// 
a=0;//     .line 214
a=0;//     add-int v4, v38, v25
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     mul-int/2addr v4, v5
a=0;// 
a=0;//     aput v4, v34, v38
a=0;// 
a=0;//     .line 216
a=0;//     :cond_d
a=0;//     aget v4, v34, v38
a=0;// 
a=0;//     add-int v23, v37, v4
a=0;// 
a=0;//     .line 218
a=0;//     .restart local v23    # "p":I
a=0;//     #v23=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v6, v24, v23
a=0;// 
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 219
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v6, v17, v23
a=0;// 
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 220
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v6, v10, v23
a=0;// 
a=0;//     aput v6, v30, v4
a=0;// 
a=0;//     .line 222
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v27, v27, v4
a=0;// 
a=0;//     .line 223
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v18, v18, v4
a=0;// 
a=0;//     .line 224
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v11, v4
a=0;// 
a=0;//     .line 226
a=0;//     add-int v29, v29, v27
a=0;// 
a=0;//     .line 227
a=0;//     add-int v20, v20, v18
a=0;// 
a=0;//     .line 228
a=0;//     add-int/2addr v13, v11
a=0;// 
a=0;//     .line 230
a=0;//     add-int/lit8 v4, v32, 0x1
a=0;// 
a=0;//     rem-int v32, v4, v14
a=0;// 
a=0;//     .line 231
a=0;//     aget-object v30, v31, v32
a=0;// 
a=0;//     .line 233
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v28, v28, v4
a=0;// 
a=0;//     .line 234
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v19, v19, v4
a=0;// 
a=0;//     .line 235
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v12, v4
a=0;// 
a=0;//     .line 237
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v27, v27, v4
a=0;// 
a=0;//     .line 238
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v18, v18, v4
a=0;// 
a=0;//     .line 239
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v30, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v11, v4
a=0;// 
a=0;//     .line 241
a=0;//     add-int v39, v39, v5
a=0;// 
a=0;//     .line 198
a=0;//     add-int/lit8 v38, v38, 0x1
a=0;// 
a=0;//     goto/16 :goto_9
a=0;// .end method
}}
