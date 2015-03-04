package com.actionbarsherlock.widget; class ActivityChooserModel$HistoryLoader { void a() { int a;
a=0;// .class final Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActivityChooserModel.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x12
a=0;//     name = "HistoryLoader"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/actionbarsherlock/widget/ActivityChooserModel;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 930
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/widget/ActivityChooserModel;Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 930
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;-><init>(Lcom/actionbarsherlock/widget/ActivityChooserModel;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;)Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 930
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 24
a=0;// 
a=0;//     .prologue
a=0;//     .line 933
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 935
a=0;//     .local v4, "fis":Ljava/io/FileInputStream;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-static/range {v21 .. v21}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->access$0(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     #v22=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-static/range {v22 .. v22}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->access$1(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v21 .. v22}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 943
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 944
a=0;//     .local v12, "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     #v12=(Reference,Lorg/xmlpull/v1/XmlPullParser;);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v12, v4, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 946
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 947
a=0;//     .local v17, "type":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v17=(Integer);v21=(PosByte);
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/16 v21, 0x2
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 951
a=0;//     :cond_0
a=0;//     const-string v21, "historical-records"
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v12}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v21 .. v22}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Boolean);
a=0;//     if-nez v21, :cond_3
a=0;// 
a=0;//     .line 952
a=0;//     new-instance v21, Lorg/xmlpull/v1/XmlPullParserException;
a=0;// 
a=0;//     #v21=(UninitRef,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     const-string v22, "Share records file does not start with historical-records tag."
a=0;// 
a=0;//     invoke-direct/range {v21 .. v22}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v21=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     throw v21
a=0;//     :try_end_1
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 1025
a=0;//     .end local v12    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .end local v17    # "type":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v21=(Conflicted);v23=(Conflicted);
a=0;//     move-exception v20
a=0;// 
a=0;//     .line 1026
a=0;//     .local v20, "xppe":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :try_start_2
a=0;//     #v20=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     invoke-static {}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->access$8()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v23, "Error reading historical recrod file: "
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     invoke-static/range {v23 .. v23}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->access$1(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, v20
a=0;// 
a=0;//     #v2=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 1030
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1032
a=0;//     :try_start_3
a=0;//     invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
a=0;// 
a=0;//     .line 1038
a=0;//     .end local v20    # "xppe":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v10=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 936
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v23=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 940
a=0;//     .local v5, "fnfe":Ljava/io/FileNotFoundException;
a=0;//     #v5=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 948
a=0;//     .end local v5    # "fnfe":Ljava/io/FileNotFoundException;
a=0;//     .restart local v12    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .restart local v17    # "type":I
a=0;//     :cond_2
a=0;//     :try_start_4
a=0;//     #v0=(Integer);v1=(PosByte);v4=(Reference,Ljava/io/FileInputStream;);v5=(Uninit);v12=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v17=(Integer);v21=(PosByte);v22=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v12}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 956
a=0;//     :cond_3
a=0;//     #v21=(Boolean);
a=0;//     new-instance v14, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 959
a=0;//     .local v14, "readRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Reference,Ljava/util/ArrayList;);v15=(Conflicted);v16=(Conflicted);v19=(Conflicted);v21=(Conflicted);
a=0;//     invoke-interface {v12}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 960
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     .line 990
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     invoke-static/range {v21 .. v21}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->access$2(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     monitor-enter v22
a=0;//     :try_end_4
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 992
a=0;//     :try_start_5
a=0;//     new-instance v18, Ljava/util/LinkedHashSet;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/util/LinkedHashSet;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedHashSet;);
a=0;//     invoke-direct {v0, v14}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     .line 998
a=0;//     .local v18, "uniqueShareRecords":Ljava/util/Set;, "Ljava/util/Set<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     #v0=(Reference,Ljava/util/LinkedHashSet;);v18=(Reference,Ljava/util/LinkedHashSet;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     invoke-static/range {v21 .. v21}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->access$3(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 999
a=0;//     .local v7, "historicalRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v7}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 1000
a=0;//     .local v8, "historicalRecordsCount":I
a=0;//     #v8=(Integer);
a=0;//     add-int/lit8 v9, v8, -0x1
a=0;// 
a=0;//     .local v9, "i":I
a=0;//     :goto_3
a=0;//     #v6=(Conflicted);v9=(Integer);
a=0;//     if-gez v9, :cond_8
a=0;// 
a=0;//     .line 1005
a=0;//     invoke-interface {v7}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     invoke-interface/range {v18 .. v18}, Ljava/util/Set;->size()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_9
a=0;// 
a=0;//     .line 1006
a=0;//     monitor-exit v22
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 1030
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1032
a=0;//     :try_start_6
a=0;//     invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1033
a=0;//     :catch_2
a=0;//     move-exception v21
a=0;// 
a=0;//     #v21=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 963
a=0;//     .end local v7    # "historicalRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .end local v8    # "historicalRecordsCount":I
a=0;//     .end local v9    # "i":I
a=0;//     .end local v18    # "uniqueShareRecords":Ljava/util/Set;, "Ljava/util/Set<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     :cond_5
a=0;//     #v1=(One);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v18=(Uninit);v21=(One);v23=(Uninit);
a=0;//     const/16 v21, 0x3
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_4
a=0;// 
a=0;//     const/16 v21, 0x4
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     if-eq v0, v1, :cond_4
a=0;// 
a=0;//     .line 966
a=0;//     :try_start_7
a=0;//     invoke-interface {v12}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 967
a=0;//     .local v11, "nodeName":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v21, "historical-record"
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Boolean);
a=0;//     if-nez v21, :cond_6
a=0;// 
a=0;//     .line 968
a=0;//     new-instance v21, Lorg/xmlpull/v1/XmlPullParserException;
a=0;// 
a=0;//     #v21=(UninitRef,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     const-string v22, "Share records file not well-formed."
a=0;// 
a=0;//     invoke-direct/range {v21 .. v22}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v21=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     throw v21
a=0;//     :try_end_7
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_7 .. :try_end_7} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     .line 1027
a=0;//     .end local v11    # "nodeName":Ljava/lang/String;
a=0;//     .end local v12    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .end local v14    # "readRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .end local v17    # "type":I
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v17=(Conflicted);v18=(Conflicted);v21=(Conflicted);v23=(Conflicted);
a=0;//     move-exception v10
a=0;// 
a=0;//     .line 1028
a=0;//     .local v10, "ioe":Ljava/io/IOException;
a=0;//     :try_start_8
a=0;//     #v10=(Reference,Ljava/io/IOException;);
a=0;//     invoke-static {}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->access$8()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v23, "Error reading historical recrod file: "
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     invoke-static/range {v23 .. v23}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->access$1(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     .line 1030
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1032
a=0;//     :try_start_9
a=0;//     invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1033
a=0;//     :catch_4
a=0;//     move-exception v21
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 971
a=0;//     .end local v10    # "ioe":Ljava/io/IOException;
a=0;//     .restart local v11    # "nodeName":Ljava/lang/String;
a=0;//     .restart local v12    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .restart local v14    # "readRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .restart local v17    # "type":I
a=0;//     :cond_6
a=0;//     #v1=(PosByte);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Reference,Ljava/lang/String;);v12=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v14=(Reference,Ljava/util/ArrayList;);v17=(Integer);v18=(Uninit);v21=(Boolean);v23=(Uninit);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     :try_start_a
a=0;//     #v21=(Null);
a=0;//     const-string v22, "activity"
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v12, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 973
a=0;//     .local v3, "activity":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     const-string v22, "time"
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v21 .. v21}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     .line 975
a=0;//     .local v15, "time":J
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     const-string v22, "weight"
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-interface {v12, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v21 .. v21}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 977
a=0;//     .local v19, "weight":F
a=0;//     #v19=(Float);
a=0;//     new-instance v13, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     move-wide v0, v15
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move/from16 v2, v19
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-direct {v13, v3, v0, v1, v2}, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;-><init>(Ljava/lang/String;JF)V
a=0;// 
a=0;//     .line 979
a=0;//     .local v13, "readRecord":Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     #v13=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_a
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_a .. :try_end_a} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1029
a=0;//     .end local v3    # "activity":Ljava/lang/String;
a=0;//     .end local v11    # "nodeName":Ljava/lang/String;
a=0;//     .end local v12    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .end local v13    # "readRecord":Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     .end local v14    # "readRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .end local v15    # "time":J
a=0;//     .end local v17    # "type":I
a=0;//     .end local v19    # "weight":F
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);
a=0;//     move-exception v21
a=0;// 
a=0;//     .line 1030
a=0;//     #v21=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     .line 1032
a=0;//     :try_start_b
a=0;//     invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7
a=0;// 
a=0;//     .line 1037
a=0;//     :cond_7
a=0;//     :goto_4
a=0;//     throw v21
a=0;// 
a=0;//     .line 1001
a=0;//     .restart local v7    # "historicalRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .restart local v8    # "historicalRecordsCount":I
a=0;//     .restart local v9    # "i":I
a=0;//     .restart local v12    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .restart local v14    # "readRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .restart local v17    # "type":I
a=0;//     .restart local v18    # "uniqueShareRecords":Ljava/util/Set;, "Ljava/util/Set<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     :cond_8
a=0;//     :try_start_c
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(One);v7=(Reference,Ljava/util/List;);v8=(Integer);v9=(Integer);v10=(Uninit);v12=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v14=(Reference,Ljava/util/ArrayList;);v17=(Integer);v18=(Reference,Ljava/util/LinkedHashSet;);v20=(Uninit);v22=(Reference,Ljava/lang/Object;);v23=(Uninit);
a=0;//     invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     .line 1002
a=0;//     .local v6, "historicalRecord":Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1000
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 1010
a=0;//     .end local v6    # "historicalRecord":Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     :cond_9
a=0;//     #v0=(Integer);v1=(Integer);v6=(Conflicted);v21=(Integer);v23=(Integer);
a=0;//     invoke-interface {v7}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 1011
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedHashSet;);
a=0;//     invoke-interface {v7, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 1013
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel;);
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     #v23=(One);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->access$4(Lcom/actionbarsherlock/widget/ActivityChooserModel;Z)V
a=0;// 
a=0;//     .line 1018
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;->this$0:Lcom/actionbarsherlock/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     invoke-static/range {v21 .. v21}, Lcom/actionbarsherlock/widget/ActivityChooserModel;->access$5(Lcom/actionbarsherlock/widget/ActivityChooserModel;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     new-instance v23, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader$1;
a=0;// 
a=0;//     #v23=(UninitRef,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader$1;);
a=0;//     invoke-direct/range {v23 .. v24}, Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader$1;-><init>(Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader;)V
a=0;// 
a=0;//     #v23=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader$1;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoryLoader$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 990
a=0;//     monitor-exit v22
a=0;//     :try_end_c
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_1
a=0;// 
a=0;//     .line 1030
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1032
a=0;//     :try_start_d
a=0;//     invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1033
a=0;//     :catch_5
a=0;//     move-exception v21
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 990
a=0;//     .end local v7    # "historicalRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .end local v8    # "historicalRecordsCount":I
a=0;//     .end local v9    # "i":I
a=0;//     .end local v18    # "uniqueShareRecords":Ljava/util/Set;, "Ljava/util/Set<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v18=(Conflicted);v21=(Conflicted);v23=(Conflicted);
a=0;//     move-exception v21
a=0;// 
a=0;//     :try_start_e
a=0;//     #v21=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v22
a=0;//     :try_end_e
a=0;//     .catchall {:try_start_e .. :try_end_e} :catchall_1
a=0;// 
a=0;//     :try_start_f
a=0;//     throw v21
a=0;//     :try_end_f
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_f .. :try_end_f} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_3
a=0;//     .catchall {:try_start_f .. :try_end_f} :catchall_0
a=0;// 
a=0;//     .line 1033
a=0;//     .end local v12    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .end local v14    # "readRecords":Ljava/util/List;, "Ljava/util/List<Lcom/actionbarsherlock/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .end local v17    # "type":I
a=0;//     .restart local v20    # "xppe":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :catch_6
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v2=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);v12=(Conflicted);v14=(Conflicted);v17=(Conflicted);v20=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);v23=(Reference,Ljava/lang/String;);
a=0;//     move-exception v21
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .end local v20    # "xppe":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v10=(Conflicted);v20=(Conflicted);v22=(Conflicted);v23=(Conflicted);
a=0;//     move-exception v22
a=0;// 
a=0;//     #v22=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_4
a=0;// .end method
}}
