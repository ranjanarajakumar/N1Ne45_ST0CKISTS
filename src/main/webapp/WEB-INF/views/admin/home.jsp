<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<link href="<c:url value="/resources/vendors/fullcalendar/fullcalendar.css" />" rel="stylesheet" media="screen">
 <style>
        #external-events {
            float: left;
            width: 150px;
            padding: 0 10px;
            border: 1px solid #ccc;
            background: #eee;
            text-align: left;
            }
            
        #external-events h4 {
            font-size: 16px;
            margin-top: 0;
            padding-top: 1em;
            }
            
        .external-event { /* try to mimick the look of a real event */
            margin: 10px 0;
            padding: 2px 4px;
            background: #3366CC;
            color: #fff;
            font-size: .85em;
            cursor: pointer;
            z-index: 99999999;
            }
            
        #external-events p {
            margin: 1.5em 0;
            font-size: 11px;
            color: #666;
            }
            
        #external-events p input {
            margin: 0;
            vertical-align: middle;
            }

        </style>
	<!-- 
	<meta name="decorator" content="default" />	
	 --> 
	<title>Home</title>
</head>
<body>
	 <!--/span-->
                <div class="span9" id="content">
                    <div class="row-fluid">
                        <!-- block -->
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Calendar</div>
                                <div class="pull-right">

                                </div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span2">
                                    <div id='external-events'>
                                    <h4>Pending Events</h4>
                                    <div class='external-event'>Event 1</div>
                                    <div class='external-event'>Event 2</div>
                                    <div class='external-event'>Event 3</div>
                                    <div class='external-event'>Event 4</div>
                                    <div class='external-event'>Event 5</div>                                  
                                    <p>
                                    <input type='checkbox' id='drop-remove' /> <label for='drop-remove'>remove after drop</label>
                                    </p>
                                    </div>

                                </div>
                                <div class="span10">
                                    <div></div>
                                </div>
                            </div>
                        </div>
                        <!-- /block -->
                    </div>
                </div>
            <hr>     
        
        <!--/.fluid-container-->
        <script src="<c:url value="/resources/vendors/jquery-ui-1.10.3.js" />"></script>
        <script src="<c:url value="/resources/vendors/fullcalendar/fullcalendar.js" />"></script>
        <script src="<c:url value="/resources/vendors/fullcalendar/gcal.js" />"></script>      
</body>
</html>
